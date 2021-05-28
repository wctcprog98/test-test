
<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }" class="text">Home</router-link
      >&nbsp;|&nbsp;
      <router-link
        v-bind:to="{ name: 'logout' }"
        v-if="$store.state.token != ''"
        class="text"
        >Logout</router-link
      >
    </div>
    <router-view />
    <div></div>
  </div>
</template>

<script>
export default {};
</script>

<style>
.DashBoard {
  box-sizing: border-box;
  padding: 25px;
  display: grid;
  grid-template-rows: 1fr 5fr 3fr;
  grid-template-columns: 1fr 1fr;
  grid-gap: 7%;
  grid-template-areas:
    "Header Header Header"
    "BreweryCard MainTop Maintop"
    "BreweryCard MainBottom MainBottom";
}

.Header {
  grid-area: Header;
  background: #ffd700;
  height: 120%;
  border-radius: 10px;
  border: 6px solid black;
}

.BreweryCard {
  grid-area: BreweryCard;
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

.MainTop {
  grid-area: MainTop;
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

.MainBottom {
  grid-area: MainBottom;
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

body {
  background-image: url("./images/background.jpg");
  background-size: cover;
  background-repeat: repeat-y;
  /* ADDITION */
  font-family: "Papyrus";
  /* font-family: "Fantasy"; */
}

/* ADDITION */
.text {
  color: white;
}

img {
  width: 120px;
  height: 120px;

  border-radius: 140%;

  border: 5px solid black;
}

.flex-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: stretch;
  padding-top: 20px;
  padding-left: 10px;
  background-color: #ffd700;
}

.title {
  font: bold;
  font-size: 100px;

  color: #ffd700;
  justify-items: right;
  border: 5px solid black;
  padding-left: 1%;
  padding-right: -10%;
  border-radius: 10px;
  background-color: brown;
  border-style: ridge;
}

.form-signin {
  float: right;
  background-color: rgb(233, 218, 153);
  border: 5px solid black;
  border-radius: 12px;
  padding: 4%;

  flex-grow: 1;
}

.title:hover {
  border: 5px solid yellow;
}
@import url("http://fonts.cdnfonts.com/css/biergarten");
</style>

