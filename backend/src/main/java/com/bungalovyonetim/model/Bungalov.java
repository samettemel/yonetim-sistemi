package com.bungalovyonetim.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Bungalov varlık sınıfı
 * Bungalov bilgilerini veritabanında saklamak için kullanılan JPA entity sınıfıdır
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bungalov")
public class Bungalov {

    /**
     * Bungalov'un benzersiz kimlik numarası
     * Otomatik olarak üretilen birincil anahtar
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Bungalov'un adı
     * Örnek: "Deniz Manzaralı Villa", "Orman Bungalov"
     */
    @Column(name = "ad", nullable = false)
    private String ad;

    /**
     * Bungalov hakkında detaylı açıklama
     * Bungalov'un özelliklerini, konumunu ve diğer bilgilerini içerir
     */
    @Column(name = "aciklama", columnDefinition = "TEXT")
    private String aciklama;

    /**
     * Bungalov'un günlük kiralama fiyatı
     * Para birimi: Türk Lirası (TL)
     */
    @Column(name = "gunluk_fiyat", nullable = false)
    private double gunlukFiyat;

    /**
     * Bungalov'un müsaitlik durumu
     * true: Müsait (rezervasyon yapılabilir)
     * false: Dolu (rezervasyon yapılamaz)
     * Varsayılan değer: true
     */
    @Column(name = "musaitlik", nullable = false)
    private boolean musaitlik = true;
}
