package com.bungalovyonetim.controller;

import com.bungalovyonetim.model.Bungalov;
import com.bungalovyonetim.service.BungalovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Yeni bir bungalov oluşturur
     * POST /api/bungalovlar endpoint'ine gelen istekleri karşılar
     * RequestBody olarak alınan Bungalov nesnesini veritabanına kaydeder
     * 
     * @param bungalov Kaydedilecek bungalov bilgileri (JSON formatında)
     * @return ResponseEntity<Bungalov> HTTP 201 (Created) status kodu ile kaydedilen bungalov
     */
    @PostMapping
    public ResponseEntity<Bungalov> createBungalov(@RequestBody Bungalov bungalov) {
        // Service katmanından bungalovu kaydet
        Bungalov savedBungalov = bungalovService.save(bungalov);
        
        // HTTP 201 Created status kodu ile kaydedilen bungalovu döndür
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBungalov);
    }
}
