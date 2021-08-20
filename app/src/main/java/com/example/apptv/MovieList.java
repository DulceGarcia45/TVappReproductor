package com.example.apptv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Favoritas",
            "Terror",
            "Comedia",
            "Animadas",
            "Suspenso",
            "Accion",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if( list == null ) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "El Padrino (1972)",
                "El mago de Oz (1939)",
                "E.T., el extraterrestre (1982)",
                "2001: Odisea del espacio (1968)",
                "Pulp Fiction (1994)"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";
        String studio[] = {
                "Studio 1", "Studio 2", "Studio 3", "Studio 4", "Studio 5"
        };
        String videoUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "https://www.infobae.com/new-resizer/8WhrL6FXLn4vyPxAdaPECTaaal4=/992x558/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/6EEIQ3E4DRE5XC6NIGGLBDYNJY.jpg",
                "https://www.infobae.com/new-resizer/O4jzO2x2B90c0f_Yfv-1RnEmC4w=/992x558/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/J54JEWTHIJB7JIAMADTKDRZ4DY.jpg",
                "https://www.infobae.com/new-resizer/D9nuPGSgFcSd8FxG60eCNTWBQXQ=/992x661/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/IE3GKZVONRDFPPWITZ4ANWWVD4.jpg",
                "https://www.infobae.com/new-resizer/q9YjH9RJbxar0K_NFWnLSFNXg1g=/992x558/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/NUKFJWRF6VAXTPYUUE4ZOCGNEE.jpg",
                "https://www.infobae.com/new-resizer/t39wk8tjQzPa2gbH63czG8Lc7GQ=/992x661/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/T3TD4OZZ2FA6VGRS6YW6UFJ2EE.jpg"
        };
        String cardImageUrl[] = {
                "https://www.infobae.com/new-resizer/8WhrL6FXLn4vyPxAdaPECTaaal4=/992x558/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/6EEIQ3E4DRE5XC6NIGGLBDYNJY.jpg",
                "https://www.infobae.com/new-resizer/O4jzO2x2B90c0f_Yfv-1RnEmC4w=/992x558/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/J54JEWTHIJB7JIAMADTKDRZ4DY.jpg",
                "https://www.infobae.com/new-resizer/D9nuPGSgFcSd8FxG60eCNTWBQXQ=/992x661/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/IE3GKZVONRDFPPWITZ4ANWWVD4.jpg",
                "https://www.infobae.com/new-resizer/q9YjH9RJbxar0K_NFWnLSFNXg1g=/992x558/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/NUKFJWRF6VAXTPYUUE4ZOCGNEE.jpg",
                "https://www.infobae.com/new-resizer/t39wk8tjQzPa2gbH63czG8Lc7GQ=/992x661/filters:format(jpg):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/T3TD4OZZ2FA6VGRS6YW6UFJ2EE.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}