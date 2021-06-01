<template>
  <div class="beer-menu">
    <h1>Menu</h1>
    <beer-summary
      v-for="beer in allBeers"
      v-bind:key="beer.id"
      v-bind:beer="beer"
    />
  </div>
</template>

<script>
import BeerService from "@/services/BeerService";
import BeerSummary from "./BeerSummary.vue";

export default {
  components: { BeerSummary },
  props: {
    breweryNumber: Number,
  },
  data() {
    return {
      allBeers: [],
    };
  },
  created() {
    BeerService.listByBreweryId(this.breweryNumber).then((response) => {
      this.allBeers = response.data;
    });
  },
};
</script>

<style>
</style>
