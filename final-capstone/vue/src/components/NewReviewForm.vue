<template>
  <div>
    <button v-on:click="showForm = !showForm">Add a New Review</button>
    <form v-show="showForm">
      <label for="star-rating">Star Rating</label>
      <select name="star-rating" v-model="newReview.starRating">
        <option value="">--Please select a star rating</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
      </select>
      <label for="review-text">Leave us a Review!</label>
      <textarea name="review-text" v-model="newReview.reviewText" />
      <button typt="submit" v-on:click.prevent="postReview()">Submit</button>
      <button v-on:click.prevent="showForm = !showForm">Cancel</button>
    </form>
  </div>
</template>

<script>
import reviewService from "@/services/ReviewService";
export default {
  data() {
    return {
      showForm: false,
      newReview: {
        beerId: this.beerId,
        reviewerId: this.$store.state.user.id,
        reviewText: "",
        starRating: "",
      },
    };
  },
  props: {
    beerId: Number,
  },
  methods: {
    postReview() {
      this.newReview.starRating = parseInt(this.newReview.starRating);

      reviewService.create(this.newReview).then((response) => {
        if (response.status === 201) {
          this.newReview = {
            beerId: this.beerId,
            reviewerId: this.$store.state.user.id,
            reviewText: "",
            starRating: "",
          };
          this.$router.go();
        }
      });
    },
  },
};
</script>

<style>
</style>