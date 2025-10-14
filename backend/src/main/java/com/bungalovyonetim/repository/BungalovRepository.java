package com.bungalovyonetim.repository;

import com.bungalovyonetim.model.Bungalov;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Bungalov verilerine erişim için repository arayüzü
 * JpaRepository'den miras alarak temel CRUD işlemlerini sağlar
 * Bungalov varlığını Long tipindeki ID ile yönetir
 */
@Repository
public interface BungalovRepository extends JpaRepository<Bungalov, Long> {
    // JpaRepository'den gelen temel metodlar:
    // - save(Bungalov bungalov): Yeni bungalov kaydetme veya mevcut kaydı güncelleme
    // - findById(Long id): ID'ye göre bungalov bulma
    // - findAll(): Tüm bungalovları listeleme
    // - deleteById(Long id): ID'ye göre bungalov silme
    // - count(): Toplam bungalov sayısını döndürme
}
