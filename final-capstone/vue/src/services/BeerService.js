import axios from 'axios'

const http = axios.create({
    baseURL: "http://localhost:8080"
})
// check to see if this is the path we want everything to happen at. 
export default {
    listAll(breweryId) {
        return http.get(`/breweries/${breweryId}/beer`)
    },
    create(breweryId, beer) {
        return http.post(`/breweries/${breweryId}/beer`, beer)
    },
    delete(breweryId, beerId) {
        return http.delete(`/breweries/${breweryId}/beer/${beerId}`)
    },
    update(breweryId, beerId, beer) {
        return http.put(`/breweries/${breweryId}/beer/${beerId}`, beer)
    },
    get(breweryId, beerId) {
        return http.get(`/breweries/${breweryId}/beer/${beerId}`)
    }

}