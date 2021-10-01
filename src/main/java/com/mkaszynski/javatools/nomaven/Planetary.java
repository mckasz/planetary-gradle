package com.mkaszynski.javatools.nomaven;

import java.io.IOException;

class Planetary {

    private final WebClient webClient;

    public Planetary(WebClient webClient) {
        this.webClient = webClient;
    }

    APOD getPicture() throws IOException {
        String content = webClient.get("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
        return JsonMapper.deserialize(content, APOD.class);
    }

    public static void main(String[] args) throws IOException {
        Planetary planetary = new Planetary(new WebClient());
        APOD picture = planetary.getPicture();
        System.out.println(picture.title);
    }
}
