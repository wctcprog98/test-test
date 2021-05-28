<template>
  <div>
    <h2>{{ brewery.breweryName }}</h2>
    <h2>{{ brewery.breweryCity + "," + brewery.breweryState }}</h2>
    <button v-on:click="viewDetails()">View Details</button>
  </div>
</template>


<script>
export default {
  props: {
    brewery: Object,
  },
  methods: {
    viewDetails() {
      const id = this.brewery.id;
      this.$router.push({ name: "breweryDetails", params: { id } });
    },
  },
};
</script>

<style>
</style>