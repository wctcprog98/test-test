<template>
  <div>
    <Header />
    <brewery-contact v-bind:brewery="this.thisBrewery" />
    <button v-on:click="showUpdateForm()">Update</button>
    <update-brewery-form
      v-if="this.$store.state.showUpdateBreweryForm"
      v-bind:breweryNumber="breweryId"
    />
    <brewery-menu v-bind:breweryNumber="breweryId" />
  </div>
</template>

<script>
import BreweryContact from "../components/BreweryContact.vue";
import UpdateBreweryForm from "../components/UpdateBreweryForm.vue";
import BreweryService from "@/services/BreweryService";
import Header from "../components/Header.vue";
import BreweryMenu from "../components/BreweryMenu.vue";
export default {
  data() {
    return {
      breweryId: parseInt(this.$route.params.id),
      thisBrewery: {},
    };
  },
  components: { UpdateBreweryForm, BreweryContact, Header, BreweryMenu },
  methods: {
    showUpdateForm() {
      this.$store.commit("TOGGLE_UPDATE_BREWERY");
    },
  },
  created() {
    BreweryService.get(this.breweryId).then((response) => {
      if (response.status === 200) {
        this.thisBrewery = response.data;
      }
    });
  },
};
</script>

<style>
</style>