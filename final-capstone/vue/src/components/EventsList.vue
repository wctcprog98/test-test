<template>
  <div class="events-list">
    <h2>Events</h2>
    <p
      v-for="event in allEvents"
      v-bind:key="event.id"
      v-bind:event="event"
      class="events"
    >
      {{ event.eventName }} <br />
      {{ event.eventDate | formatDate }}
      <br />
      {{ event.eventTime }} <br />
      {{ event.eventName }}
      {{ event.eventDescription }}
    </p>
  </div>
</template>

<script>
import EventService from "@/services/EventService";
export default {
  data() {
    return {
      allEvents: [],
    };
  },
  created() {
    EventService.listByBreweryId(1).then((response) => {
      this.allEvents = response.data;
    });
  },
};
</script>

<style>
</style>