package com.stribling.vogelhaus.Controller;

import com.stribling.vogelhaus.Entity.Haus;
import com.stribling.vogelhaus.Model.HausModel;
import com.stribling.vogelhaus.Service.HausService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class HausController {
    @Autowired
    private HausService hausService;

    //Create
    @PostMapping("/haus")
    public Haus createHaus(@RequestBody HausModel hausModel){
        return this.hausService.createHaus(hausModel);
    }
    @PutMapping("/haus/{id}")
    public Haus updateHaus(@PathVariable Long id, @RequestBody HausModel hausModel){
        hausModel.setId(id);
        return this.hausService.updateHaus(hausModel);
    }

    //Read
    @GetMapping("/hauses")
    public List<Haus> getAllHauses(){
        return hausService.getAllHauses();
    }

    @GetMapping("/hauses/{id}")
    public Haus getHausById(@PathVariable Long id){
        return hausService.getHausById(id);
    }
}
