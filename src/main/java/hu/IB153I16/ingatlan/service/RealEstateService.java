package hu.IB153I16.ingatlan.service;

import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class RealEstateService {
    @Autowired
    private RealEstateRepository realEstateRepository;

    public List<RealEstate> findByTelepulesNev(String keyword){
        return realEstateRepository.findByTelepulesNev(StringUtils.capitalize(keyword));
    }
}
