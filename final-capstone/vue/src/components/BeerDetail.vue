<template>
  <div>
    <h1>Details</h1>
    <span>Description:</span>
    {{ beer.beerDescription }}
    <review-list v-bind:reviews="reviews" />
  </div>
</template>

<script>
import ReviewService from "@/services/ReviewService";
import ReviewList from "./ReviewList.vue";
export default {
  components: {
    ReviewList,
  },
  props: {
    beer: Object,
  },
  data() {
    return {
      reviews: [],
    };
  },
  created() {
    ReviewService.listByBeerId(this.beer.id).then((response) => {
      if (response.status == 200) {
        this.reviews = response.data;
      }
    });
  },
};
</script>

<style>
</style>