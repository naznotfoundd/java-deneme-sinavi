# Rapor

**Ad Soyad:Naz Kuruçay**
**Numara:663**

## 1. Problem Analizi
<!-- Problemi kendi cümlelerinizle yazın. -->
Kullanıcın olmuş olduğu 20 soruluk testin doğru ve yanlış cevap sayılarını alıp deneme sınavının sonucunu hesaplayan bir program yaptık. Önce girilen sayıların geçerli olup olmadığını kontrol ettim. Daha sonra boş sayısını ve neti hesaplayıp nete göre başarı durumunu ekrana yazdırdım.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-Doğru sayısı,yanlış sayısı

**İşlemler:**
Girilen sayıların negatif olup olmadığını ve toplamlarının 20'yi geçip geçmediğini kontrol et
Boş soru sayısını hesapla.
Net sayısını hesapla.
Bulunan nete göre başarı durumunu belirle

**Çıktılar:**
Boş soru sayısı
Net sayısı
Başarı durumu (Çok iyi, İyi, Orta, Geliştirilmeli)
Hatalı giriş yapılırsa uyarı mesajı

## 3. Matematiksel Formüller
bos = 20 - (Doğru + Yanlış)
net = Doğru - (Yanlış / 4)
-

## 4. Sözde Kod (Pseudocode)

BAŞLA
dogru, yanlis, bos ve net değişkenlerini tanımla.
Kullanıcıdan doğru ve yanlış sayılarını al.

EĞER dogru < 0 VEYA yanlis < 0 VEYA dogru + yanlis > 20 İSE
    "Geçersiz giriş!" yazdır.
DEĞİLSE
    bos = 20 - (dogru + yanlis)
    net = dogru - (yanlis / 4)

    Boş sayısını ve neti yazdır.

    EĞER net >= 15 İSE
        "Çok iyi" yazdır.
    DEĞİLSE EĞER net >= 10 İSE
        "İyi" yazdır.
    DEĞİLSE EĞER net > 5 İSE
        "Orta" yazdır.
    DEĞİLSE
        "Geliştirilmeli" yazdır.
    BİTİR
BİTİR

## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)


## 6. Başarı Durumu Koşulları
<!-- Koşulları hangi sırayla ve hangi operatörlerle yazdığınızı, nedenini açıklayın. -->
Başarı durumunu net sayısına göre ayarladım. 15 ve üzeri net yapanlara Çok iyi, 10 ve üzeri yapanlara İyi, 5'ten fazla yapanlara Orta, diğerlerine ise Geliştirilmeli dedim.

Bunun için if, else if ve else kullandık. Önce yüksek netleri kontrol ettik, sonra diğerlerine baktım.

## 7. Test Sonuçları

## Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi | Net 20, Çok iyi | Evet |
| 15 | 4 | Net 14, İyi | Net 14, İyi | Evet |
| 10 | 8 | Net 8, Orta | Net 8, Orta | Evet |
| 5 | 0 | Net 5, Geliştirilmeli | Net 5, Orta | Hayır |
| 0 | 20 | Net -5, Geliştirilmeli | Net -5, Geliştirilmeli | Evet |
| 10 | 10 | Net 7,5, Orta | Net 7,5, Orta | Evet |
| 15 | 10 | Geçersiz giriş | Geçersiz giriş | Evet |
| 12 | 9 | Geçersiz giriş | Geçersiz giriş | Evet |
| -1 | 5 | Geçersiz giriş | Geçersiz giriş | Evet |
