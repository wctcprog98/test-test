<template>
  <div>
    <button v-on:click="showForm = !showForm">Add a New Brewery</button>

    <form v-show="showForm" v-on:submit.prevent="addBrewery()">
      <label for="brewery-name">Brewery Name</label>
      <input type="text" name="brewery-name" v-model="newBrewery.breweryName" />

      <label for="brewer-id">Brewery ID</label>
      <input
        v-model="newBrewery.brewerId"
        type="text"
        placeholder="do I work?"
        name="brewer-id"
      />

      <label for="brewery-address"> Address</label>
      <input
        v-model="newBrewery.breweryStreetAddress"
        type="text"
        name="brewery-address"
      />

      <label for="brewery-city"> City</label>
      <input v-model="newBrewery.breweryCity" type="text" name="brewery-city" />

      <label for="brewery-state"> State</label>
      <input
        v-model="newBrewery.breweryState"
        type="text"
        name="brewery-state"
      />

      <label for="brewery-zip">Zip</label>
      <input
        v-model="newBrewery.breweryZipCode"
        type="text"
        name="brewery-zip"
      />

      <label for="brewery-website">Website</label>
      <input
        v-model="newBrewery.breweryWebsite"
        type="text"
        name="brewery-website"
      />
      <button type="submit" class="btn save">Save Brewery</button>
    </form>
  </div>
</template>

<script>
import breweryService from "@/services/BreweryService";
export default {
  data() {
    return {
      showForm: false,

      newBrewery: {},
    };
  },
  methods: {
    addBrewery() {
      breweryService.create(this.newBrewery).then((response) => {
        if (response.status === 201) {
          this.$router.push("/");
        }
      });
    },
  },
};
</script>

<style>
form {
  display: flex;
  flex-direction: column;
  width: 33%;
}
</style>