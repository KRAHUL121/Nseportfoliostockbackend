package com.kgisl.strnsestock.demostock;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import com.kgisl.strnsestock.demostock.Nsestock;;
//import com.kgfsl.forum.Agenda;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/nsestock")
public class NsestockController {

    @Autowired
    private NsestockService nsestockService;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<Nsestock>> all() {
        
        return new ResponseEntity<>(nsestockService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Nsestock nsestock,UriComponentsBuilder ucBuilder) {
        
        
        nsestockService.save(nsestock);
        
        HttpHeaders headers = new HttpHeaders();
        // headers.setLocation(ucBuilder.path("/get/{portfolioid}").buildAndExpand(portfolio.getaId()).toUri());
       
        return new ResponseEntity<>(headers,HttpStatus.CREATED);

    }

    @GetMapping("/get/{nsestockid}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable int nsestockId,UriComponentsBuilder ucBuilder) {
        Nsestock nsestock = nsestockService.find(nsestockId);

        
        return new ResponseEntity<>(nsestock, HttpStatus.OK);

    }

    @PutMapping("/put/{nsestockId}")
    public ResponseEntity<?> put(@PathVariable int nsestockId, @RequestBody Nsestock nsestock ) {

        nsestockService.save(nsestock);
       
        return new ResponseEntity<>(nsestock,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{nsestockId}")
    public ResponseEntity<?> delete(@PathVariable Long userid) {

        nsestockService.delete(userid);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
