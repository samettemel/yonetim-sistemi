import axios from 'axios';

async function getBungalovlar() {
  try {
    const response = await axios.get('http://localhost:8080/api/bungalovlar');
    return response.data;
  } catch (error) {
    console.error('Bungalov verileri çekilirken hata oluştu:', error);
    return [];
  }
}

export default async function BungalovlarPage() {
  const bungalovlar = await getBungalovlar();

  return (
    <div className="container mx-auto p-6">
      <h1 className="text-3xl font-bold mb-6">Bungalov Listesi</h1>
      
      {bungalovlar.length === 0 ? (
        <p className="text-gray-600">Henüz bungalov bulunmuyor.</p>
      ) : (
        <ul className="space-y-4">
          {bungalovlar.map((bungalov, index) => (
            <li key={index} className="border border-gray-200 rounded-lg p-4 shadow-sm">
              <div className="flex justify-between items-center">
                <h2 className="text-xl font-semibold text-gray-800">
                  {bungalov.ad}
                </h2>
                <span className="text-lg font-bold text-green-600">
                  ₺{bungalov.gunlukFiyat}/gün
                </span>
              </div>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
