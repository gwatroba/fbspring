package pl.familybook.resources;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.familybook.models.Profile;
import pl.familybook.repositories.ProfileDao;

//@Path("/profile")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//@Transactional
//@Component
@RestController
public class ProfilesResource {
	
//    @GET
//    public List getAll(){
//        List products = this.profileDao.findAll();
//        return products;
//    }
	
	ProfileDao profileDao;

    @RequestMapping("/profile")
    public List<Profile>  getAll() {
    	List<Profile> profiles = profileDao.findAll();
    	return profiles;
    }
	
}
