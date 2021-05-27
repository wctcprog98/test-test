<template>
  <div>
    <button v-on:click="showForm = !showForm">Add New User</button>

    <form v-show="showForm" v-on:submit.prevent="addBrewery">
      <label for="breweryname">Brewery Name</label>
      <input type="text" name="breweryname" v-model="breweryname" />

      <label for="brewerId">Brewery ID</label>
      <input
        v-model="brewerId"
        type="text"
        placeholder="do I work?"
        name="brewer-id"
      />

      <label for="breweryaddress"> Address</label>
      <input
        v-model="newBrewery.breweryaddress"
        type="text"
        name="breweryaddress"
      />

      <label for="brewery-city"> City</label>
      <input v-model="breweryCity" type="text" name="brewery-city" />

      <label for="brewery-state"> State</label>
      <input v-model="breweryState" type="text" name="brewery-state" />

      <label for="brewery-zip">Zip</label>
      <input v-model="breweryZip" type="text" name="brewery-zip" />

      <label for="brewery-website">Website</label>
      <input v-model="breweryWebsite" type="text" name="brewery-website" />
      <button type="submit" class="btn save">Save Brewery</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      filter: {
        newBrewery: "",
        breweryname: "",
        brewerId: "",
        breweryAddress: "",
        breweryCity: "",
        breweryState: "",
        breweryZip: "",
        breweryWebsite: "",
      },
      showForm: false,
      newBrewery: {
        newBrewery: "",
        breweryname: "",
        brewerId: "",
        breweryAddress: "",
        breweryCity: "",
        breweryState: "",
        breweryZip: "",
        breweryWebsite: "",
      },
    };
  },
  methods: {
    addBrewery() {
      console.log("I was submitted");
      this.$axios
        .post("/api/breweries", {
          newBrewery: this.newBrewery,
        })
        .then((response) => {
          console.log(response);
        })
        .catch((error) => {
          console.log(error);
        });
    },
    clearNewBrewery() {
      this.newBrewery = {
        newBrewery: "",
        breweryname: "",
        brewerId: "",
        breweryAddress: "",
        breweryCity: "",
        breweryState: "",
        breweryZip: "",
        breweryWebsite: "",
      };
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