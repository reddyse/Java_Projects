/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdbdataextract;

/**
 *
 * @author prane
 */
public class Season {
    private String id;
    private String air_date;
    private Episodes[] episodes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAir_date() {
        return air_date;
    }

    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }

    public Episodes[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Episodes[] episodes) {
        this.episodes = episodes;
    }
}
