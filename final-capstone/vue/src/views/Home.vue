<template>
  <div class="home">
    <div class="DashBoard">
      <Header />
      <brewery-list />
      <main-top />
      <main-bottom />
    </div>
  </div>
</template>

<script>
import BreweryList from "../components/BreweryList.vue";
import Header from "../components/Header.vue";
import MainBottom from "../components/MainBottom.vue";
import MainTop from "../components/MainTop.vue";
export default {
  components: { Header, BreweryList, MainTop, MainBottom },
  name: "home",
};
</script>

    