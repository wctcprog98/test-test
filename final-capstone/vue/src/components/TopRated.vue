<template>
  <div class="TopRated">
    <h1 class="rated-title">Top Rated</h1>

    <top-rated-summary
      class="event-item"
      v-for="beer in beers"
      :key="beer.id"
      :beer="beer"
    />
  </div>
</template>

<script>
import beerService from "@/services/BeerService";
import TopRatedSummary from "./TopRatedSummary.vue";

export default {
  components: { TopRatedSummary },
  data() {
    return {
      beers: [],
    };
  },
  created() {
    beerService.listTopRated().then((response) => {
      if (response.status === 200) {
        this.beers = response.data;
      }
    });
  },
};
</script>

<style>
.rated-title {
  color: black;
}
</style>