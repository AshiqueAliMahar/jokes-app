package ali.ashique.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomJokeService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
