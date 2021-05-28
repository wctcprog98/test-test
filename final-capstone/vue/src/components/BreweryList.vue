<template>
  <div style="overflow-y: scroll" class="BreweryCard">
    <h1>cards</h1>

    <new-brewery-form />
    <brewery-summary
      v-for="brewery in this.breweries"
      v-bind:key="brewery.id"
      v-bind:brewery="brewery"
    />
  </div>
</template>

<script>
import BrewerySummary from "@/components/BrewerySummary";
import BreweryService from "@/services/BreweryService";
import NewBreweryForm from "./NewBreweryForm.vue";
export default {
  components: { BrewerySummary, NewBreweryForm },

  data() {
    return {
      breweries: {},
    };
  },
  created() {
    BreweryService.list().then((response) => {
      this.breweries = response.data;
    });
  },
};
</script>

<style>
</style>