<template>
  <div class="events-list">
    <h2>Events</h2>

    <events-summary
      v-for="event in allEvents"
      v-bind:key="event.id"
      v-bind:event="event"
    />
  </div>
</template>

<script>
import EventService from "@/services/EventService";
import EventsSummary from "./EventsSummary.vue";
export default {
  components: { EventsSummary },
  data() {
    return {
      allEvents: [],
    };
  },
  created() {
    EventService.listUpComing().then((response) => {
      this.allEvents = response.data;
    });
  },
  methods: {
    formatTime(time) {
      let hour = time.substring(0, 2);
      const min = time.substring(2, 5);
      let period = " AM";

      if (hour == 12) {
        period = " PM";
      } else if (hour == 0) {
        hour = 12;
      } else if (hour > 12) {
        hour = hour % 12;
        period = " PM";
      }

      return hour + min + period;
    },
  },
};
</script>

<style>
</style>