
<template>
  <div id="app">
    <router-view />
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
    "BreweryCard TopRated TopRated"
    "BreweryCard events-list events-list";
}

.Header {
  grid-area: Header;
  background: #ffd700;
  height: 120%;
  border-radius: 10px;
  border: 6px solid black;
}

.flex-container-card {
  display: flex;
  justify-content: space-between;
  align-items: flex-end;
}

.flex-container-card button {
  height: 20px;
}

.BreweryCard {
  grid-area: BreweryCard;
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

/* card temp border */
.card {
  border: 2px solid black;
  border-radius: 15px;
  padding: 5px;
  margin: 5px;
}

.user-info {
  display: flex;
  flex-direction: column;
  border: 2px solid black;
  padding: 1.25em;
  width: 150px;
}
.card:hover {
  color: red;
}

/* end of card test */

.TopRated {
  grid-area: TopRated;
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

.events-list {
  grid-area: events-list;
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

