package com.bungalovyonetim.controller;

import com.bungalovyonetim.model.Bungalov;
import com.bungalovyonetim.service.BungalovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Bungalov REST API Controller sınıfı
 * Bungalov varlığı için HTTP isteklerini karşılar
 * RESTful web servisleri sağlar
 */
@RestController
@RequestMapping("/api/bungalovlar")
public class BungalovController {

    /**
     * Bungalov iş mantığı servisi
     * @Autowired ile Spring tarafından otomatik olarak enjekte edilir
     */
    @Autowired
    private BungalovService bungalovService;

    /**
     * Tüm bungalovları listeler
     * GET /api/bungalovlar endpoint'ine gelen istekleri karşılar
     * Service katmanından tüm bungalovları getirip JSON formatında döndürür
     * 
     * @return List<Bungalov> Tüm bungalovların listesi (JSON formatında)
     */
    @GetMapping
    public List<Bungalov> getAllBungalovs() {
        // Service katmanından tüm bungalovları getir
        return bungalovService.findAll();
    }
}

