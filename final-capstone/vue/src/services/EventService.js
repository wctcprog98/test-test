import axios from 'axios'

const http = axios.create({
    baseURL: "http://localhost:8080"
})

export default {
    listByBreweryId(breweryId) {
        return http.get(`/breweries/${breweryId}/events`)
    },
    create(breweryId, event) {
        return http.post(`/breweries/${breweryId}/event`, event)
    },
    delete(breweryId, eventId) {
        return http.delete(`/breweries/${breweryId}/event/${eventId}`)
    },
    update(breweryId, eventId, event) {
        return http.put(`/breweries/${breweryId}/event/${eventId}`, event)
    }

}