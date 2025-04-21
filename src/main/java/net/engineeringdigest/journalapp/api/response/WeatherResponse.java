package net.engineeringdigest.journalapp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
public class WeatherResponse{
    private Current current;
    private Location location;

    @Getter
    @Setter
    public class Current{
        private int temperature;
        @JsonProperty("weather_descriptions")
        private ArrayList<String> weatherDescriptions;
        private int feelslike;
    }

    @Getter
    @Setter
    public class Location{
        private String name;
        private String region;
    }
}




