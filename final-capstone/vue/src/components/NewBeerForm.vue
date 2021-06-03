<template>
  <div>
    <button v-on:click="showForm = !showForm">Add a New Beer</button>

    <form v-show="showForm" v-on:submit.prevent="addBeer()">
      <label for="beer-name">Name: </label>
      <input type="text" name="beer-name" v-model="newBeer.beerName" />

      <label for="beer-style">Style: </label>
      <input v-model="newBeer.beerStyle" type="text" name="beer-style" />

      <label for="beer-desc">Description: </label>
      <textarea v-model="newBeer.beerDescription" name="beer-desc" />

      <label for="beer-abv">ABV: </label>
      <input v-model="newBeer.beerAbv" type="text" name="beer-abv" />

      <button type="submit" class="btn save">Save</button>
    </form>
    <button
      class="new-beer-cancel"
      v-show="showForm"
      v-on:click="showForm = !showForm"
    >
      Cancel
    </button>
  </div>
</template>

<script>
import beerService from "@/services/BeerService";
export default {
  data() {
    return {
      showForm: false,
      newBeer: {
        beerName: "",
        beerStyle: "",
        beerDescription: "",
        beerAbv: "",
        breweryId: this.breweryNumber,
        breweryImage: "",
      },
    };
  },
  props: {
    breweryNumber: Number,
  },
  methods: {
    addBeer() {
      beerService.create(this.newBeer).then((response) => {
        if (response.status === 201) {
          this.showForm = false;
          this.newBeer = {};
        }
      });
    },
  },
};
</script>

<style>
</style>