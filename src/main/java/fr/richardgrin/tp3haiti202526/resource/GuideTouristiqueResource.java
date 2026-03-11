package fr.richardgrin.tp3haiti202526.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/guide")
public class GuideTouristiqueResource {
    /**
     * Affiche les endroits à visiter dans une ville ou un pays donné.
     * @param villeOuPays
     * @return
     */
    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces("application/json")
    public String[] endroitsDeVisite(@PathParam("ville_ou_pays") String villeOuPays) {
//        return "Voici les endroits à visiter à " + villeOuPays;
        return new String[]{ villeOuPays };

    }
}
