<template>
  <div class="reviews">
    <h2>REVIEWS</h2>
   <h6> Average Rating:    | {{ averageRating }}| </h6> 
    <p
      v-for="review in reviews"
      v-bind:key="review.id"
      v-bind:review="review"
      class="reviews1"
    >
       - {{ review.reviewText}}
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
.reviews{
  opacity: 100%;
}

.reviews1{
  font-size: 25px;
  background:  transparent;
  background-color: white;
  opacity: 90%;
  color: black;
  padding: 2%;
  font-weight:bolder;


  border-radius: 20px;
  
}
h6{
  color:gold;
  font-weight: bolder;
}
</style>