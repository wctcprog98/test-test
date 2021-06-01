import axios from 'axios'

const http = axios.create({
    baseURL: "http://localhost:8080"
})

export default {
    listByBreweryId(breweryId) {
        return http.get(`/breweries/${breweryId}/reviews`)
    },
    listByBeerId(beerId) {
        return http.get(`/beer/${beerId}/reviews`)
    }

}

