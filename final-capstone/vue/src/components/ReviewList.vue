<template>
  <div class="reviews">
    <h2>REVIEWS</h2>
    {{ averageRating }}
    <p
      v-for="review in reviews"
      v-bind:key="review.id"
      v-bind:review="review"
      class="reviews"
    >
      {{ review.reviewText }}
    </p>
  </div>
</template>

<script>
export default {
  props: {
    reviews: Array,
  },
  computed: {
    averageRating() {
      let total = 0.0;
      this.reviews.forEach((review) => {
        total += review.starRating;
      });
      return total / this.reviews.length;
    },
  },
};
</script>

<style>
</style>