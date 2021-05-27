<template>
  <div>
    <form v-on:submit.prevent="updateBrewery()">
      <label for="brewery-name">Brewery Name</label>
      <input
        type="text"
        name="brewery-name"
        v-model="breweryToUpdate.breweryName"
      />

      <label for="brewer-id">BrewerID</label>
      <input
        type="text"
        placeholder="do I work?"
        name="brewer-id"
        v-model="breweryToUpdate.brewerId"
      />

      <label for="brewery-address"> Address</label>
      <input
        type="text"
        name="brewery-address"
        v-model="breweryToUpdate.breweryStreetAddress"
      />

      <label for="brewery-city"> City</label>
      <input
        type="text"
        name="brewery-city"
        v-model="breweryToUpdate.breweryCity"
      />

      <label for="brewery-state"> State</label>
      <input
        type="text"
        name="brewery-state"
        v-model="breweryToUpdate.breweryState"
      />

      <label for="brewery-zip">Zip</label>
      <input
        type="text"
        name="brewery-zip"
        v-model="breweryToUpdate.breweryZipCode"
      />

      <label for="brewery-website">Website </label>
      <input
        type="text"
        name="brewery-website"
        v-model="breweryToUpdate.breweryWebsite"
      />
      <button>Update Brewery</button>
    </form>
  </div>
</template>

<script>
import breweryService from "@/services/BreweryService";
export default {
  props: ["breweryNumber"],
  data() {
    return {
      breweryToUpdate: {},
    };
  },
  created() {
    breweryService.get(this.breweryNumber).then((response) => {
      this.breweryToUpdate = response.data;
    });
  },
  methods: {
    updateBrewery() {
      const brewery = {
        breweryName: this.breweryToUpdate.breweryName,
        brewerId: this.breweryToUpdate.brewerId,
        breweryStreetAddress: this.breweryToUpdate.breweryStreetAddress,
        breweryCity: this.breweryToUpdate.breweryCity,
        breweryState: this.breweryToUpdate.breweryState,
        breweryZipCode: this.breweryToUpdate.breweryZipCode,
        breweryWebsite: this.breweryToUpdate.breweryWebsite,
        isActive: this.breweryToUpdate.active,
      };
      console.log(brewery);
      breweryService.update(brewery, this.breweryNumber).then((response) => {
        if (response.status === 200) {
          this.$router.push(`/breweries/${this.breweryNumber}`);
        }
      });
    },
  },
};
</script>

<style>
</style>