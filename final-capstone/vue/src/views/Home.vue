<template>
  <div class="home">
    <div class="DashBoard">
      <Header />
      <brewery-list />
      <top-rated />
      <events-list />
    </div>
  </div>
</template>

<script>
import BreweryList from "../components/BreweryList.vue";
import EventsList from "../components/EventsList.vue";
import Header from "../components/Header.vue";

import TopRated from "../components/TopRated.vue";
export default {
  components: { Header, BreweryList, TopRated, EventsList },
  name: "home",
};
</script>

    