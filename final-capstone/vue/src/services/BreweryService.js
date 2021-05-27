import axios from 'axios'

const http = axios.create({
    baseURL: "http://localhost:8080"
});

export default {
    list() {

        return http.get('/')
    },
    create(brewery) {
        return http.post('/breweries', brewery)
    },

    get(id) {
        return http.get(`/breweries/${id}`)
    },

    update(brewery) {
        return http.put(`/breweries/${brewery.breweryId}`, brewery)
    },

    delete(id) {
        return http.delete(`/breweries/${id}`)
    }
}