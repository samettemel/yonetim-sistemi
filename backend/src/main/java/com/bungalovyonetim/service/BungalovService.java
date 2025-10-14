package com.bungalovyonetim.service;

import com.bungalovyonetim.model.Bungalov;
import com.bungalovyonetim.repository.BungalovRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Bungalov iş mantığı servis sınıfı
 * Bungalov varlığı üzerinde iş mantığı işlemlerini gerçekleştirir
 * Repository katmanı ile veritabanı işlemlerini koordine eder
 */
@Service
public class BungalovService {

    /**
     * Bungalov verilerine erişim için repository katmanı
     * @Autowired ile Spring tarafından otomatik olarak enjekte edilir
     */
    @Autowired
    private BungalovRepository bungalovRepository;

    /**
     * Tüm bungalovları veritabanından getirir
     * Repository'nin findAll() metodunu kullanarak tüm kayıtları döndürür
     * 
     * @return List<Bungalov> Tüm bungalovların listesi
     */
    public List<Bungalov> findAll() {
        // Repository katmanından tüm bungalovları getir
        return bungalovRepository.findAll();
    }

    /**
     * Yeni bir bungalov kaydeder veya mevcut bungalovu günceller
     * Repository'nin save() metodunu kullanarak veritabanı işlemini gerçekleştirir
     * 
     * @param bungalov Kaydedilecek bungalov nesnesi
     * @return Bungalov Kaydedilen/güncellenen bungalov nesnesi (ID ile birlikte)
     */
    public Bungalov save(Bungalov bungalov) {
        // Repository katmanından bungalovu kaydet
        return bungalovRepository.save(bungalov);
    }
}
