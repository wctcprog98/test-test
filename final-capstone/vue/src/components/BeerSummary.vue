<template>
  <div>
    <div class="beer-summary">
      <div><img :src="beer.beerImage" /></div>
      <a
        v-on:click.prevent="isHidden = !isHidden"
        href=""
        class="beer-name-link"
        ><div class="beer-name">{{ beer.beerName }}</div></a
      >
      <div class="beer-style">{{ beer.beerStyle }}</div>
      <div class="beer-abv">{{ beer.beerAbv }}</div>
      <div v-if="!isHidden" class="beer-description">
        <span>Description:</span>
        {{ beer.beerDescription }}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      isHidden: true,
    };
  },
  props: {
    beer: Object,
  },
};
</script>

<style>
</style>