import axios from 'axios';


export default {
addCard(flashcard) {
    return axios.post('/flashCards', flashcard);
  },
  getMyCards(id) {
    return axios.get(`/flashCards/${id}`);
  },
  deleteCard(id) {
    return axios.delete(`/flashCards/${id}`);
  },
  getCardsByKeyWord(id, key) {
    return axios.get(`/flashCards/search/${id}`, {params : {keyword : key}});
  }

}

