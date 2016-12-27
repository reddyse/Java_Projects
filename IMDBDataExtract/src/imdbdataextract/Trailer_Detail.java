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
public class Trailer_Detail {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Results_Trailer[] getResults() {
        return results;
    }

    public void setResults(Results_Trailer[] results) {
        this.results = results;
    }
    private Results_Trailer[] results;
}
