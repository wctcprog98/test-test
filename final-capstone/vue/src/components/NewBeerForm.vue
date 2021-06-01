<template>
  <div>
    <button v-on:click="showForm = !showForm">Add a New Brewery</button>

    <form v-show="showForm" v-on:submit.prevent="addBrewery()">
      <label for="new-beer">Brewery Name</label>
      <input type="text" name="beer-name" v-model="newBeer.beerName" />

      <label for="beer-address"> Address</label>
      <input
        v-model="newBeer.beerStreetAddress"
        type="text"
        name="beer-address"
      />

      <label for="beer-city"> City</label>
      <input v-model="newBeer.beerCity" type="text" name="beer-city" />

      <label for="beer-state"> State</label>
      <input v-model="newBeer.beerState" type="text" name="beer-state" />

      <label for="beer-abv">Zip</label>
      <inputd v-model="newBeer.beerAbv" type="text" name="beer-abv" />

      <label for="brewery-id">Brewery ID</label>
      <input v-model="newBeer.breweryId" type="text" name="brewery-id" />
      <button type="submit" class="btn save">Save</button>
    </form>
  </div>
</template>

<script>
import breweryService from "@/services/BeerService";
export default {
  data() {
    return {
      showForm: false,

      newBeer: {},
    };
  },
  methods: {
    addBrewery() {
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