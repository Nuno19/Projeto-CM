package com.cm.entities;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Eduardo on 12/04/2018.
 */

@IgnoreExtraProperties
public class PokemonMap {

    private String id;
    private String pokemon_id;
    private String name;
    private String image;
    private String latitude, longitude;
    private String time;

    public PokemonMap(){}

    public PokemonMap(String id, String pokemon_id, String name, String image, String latitude, String longitude,String time){
        this.id = id;
        this.pokemon_id = pokemon_id;
        this.name = name;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
    }

    public String getTime() { return time; }

    public String getId() {
        return id;
    }

    public String getPokemon_id(){
        return pokemon_id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
