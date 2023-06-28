package com.stribling.vogelhaus.Service;

import com.stribling.vogelhaus.Entity.Haus;
import com.stribling.vogelhaus.Model.HausModel;
import com.stribling.vogelhaus.RNF.ResourceNotFoundException;
import com.stribling.vogelhaus.Repository.HausRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HausService {
    @Autowired
    private HausRepository hausRepository;

    //Create
    public Haus createHaus(HausModel hausModel) {
        Haus haus = new Haus(hausModel);
        Optional<Haus> dupe = this.hausRepository.findByName(hausModel.getName());
        Optional<Haus> dupe2 = this.hausRepository.findByAddress(hausModel.getName());

        if (dupe.isPresent() || (dupe2.isPresent())){
            return null;
        }
        else {
            return hausRepository.save(haus);
        }
    }
    //Read
    public List<Haus> getAllHauses() {
        return this.hausRepository.findAll();
    }
    //Read by id
    public Haus getHausById(Long hausId) {

        Optional<Haus> haus = this.hausRepository.findById(hausId);

        if(haus.isPresent()) {
            return haus.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + hausId);
        }
    }
    //Update
    public Haus updateHaus(HausModel hausModel) {
        Optional<Haus> hausDB = this.hausRepository.findById(hausModel.getId());

        if(hausDB.isPresent()) {
            Haus hausUpdate = hausDB.get();
            hausUpdate.setId(hausModel);
            hausUpdate.setName(hausModel);
            hausUpdate.setAddress(hausModel);
            hausRepository.save(hausUpdate);
            return hausUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + hausModel.getId());
        }
    }
    //Delete
    public void deleteHaus(Long hausId) {
        Optional<Haus> hausDb = this.hausRepository.findById(hausId);

        if(hausDb.isPresent()) {
            this.hausRepository.delete(hausDb.get());
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + hausId);
        }

    }
}
