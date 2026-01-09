public class Main {
    public static void main(String[] args)
    {
        String[][] language = new  String[][]
                { // {language name in english, hello world in that language}
                        {"English", "Hello World"}, {"Abkhaz", "Салам Адунеи"},
                        {"Acehnese", "Halo Donya"}, {"Acholi", "Apwoyo lobo"},
                        {"Afar", "Nagaale Baadal"}, {"Afrikaans", "Hallo Wêreld"},
                        {"Albanian", "Përshëndetje Botë"}, {"Alur", "Amothi ngom"},
                        {"Amharic", "ሰላም አለም"}, {"Arabic", "مرحبا بالعالم"}, //10
                        {"Armenian", "Բարև աշխարհ"}, {"Assamese", "হেল্ল' ৱৰ্ল্ড"},
                        {"Avar", "Салам Дунял"}, {"Awadhi", "हैलो वर्ल्ड"},
                        {"Aymara", "Suma Uraqpachan"}, {"Azerbaijani", "Salam Dünya"},
                        {"Balinese", "Halo Jagat"}, {"Baluchi", "سلام دنیا"},
                        {"Bambara", "Bonjour Monde"}, {"Baoulé", "Bonjour Monde"}, //20
                        {"Bashkir", "Һаумыһығыҙ Донъя"}, {"Basque", "Kaixo Mundua"},
                        {"Batak Karo", "Halo Dunia"}, {"Batak Simalungun", "Horas Dunia"},
                        {"Batak Toba", "Horas Dunia"}, {"Belarusian", "Прывітанне, свет"},
                        {"Bemba", "Mwapoleni Icalo conse"}, {"Bengali", "হ্যালো ওয়ার্ল্ড"},
                        {"Betawi", "Halo Dunia"}, {"Bhojpuri", "नमस्कार दुनिया के बा"}, //30
                        {"Bikol", "Kumusta an Kinaban"}, {"Bosnian", "Zdravo svijete"},
                        {"Breton", "Salud Bed"}, {"Bulgarian", "Здравей, свят"},
                        {"Buryat", "Амар мэндэ Дэлхэй"}, {"Cantonese", "你好世界"},
                        {"Catalan", "Hola món"}, {"Cebuano", "Kumusta Kalibutan"},
                        {"Chamorro", "Håfa na Mundo"}, {"Chechen", "Салам маршал дуьне"}, //40
                        {"Chichewa", "Moni Dziko Lapansi"}, {"Chinese (Simplified)", "你好世界"},
                        {"Chinese (Traditional)", "你好世界"}, {"Chuukese", "Kapong ngeni Fonufan"},
                        {"Chuvash", "Салам Тӗнче"}, {"Corsican", "Salutu u mondu"},
                        {"Crimean Tatar (Cyrillic)", "Селям алейкум Дюнья"}, {"Crimean Tatar (Latin)", "Selâm aleyküm Dünya"},
                        {"Croatian", "Pozdrav svijete"}, {"Czech", "Ahoj světe"}, //50
                        {"Danish", "Hej Verden"}, {"Dari", "سلام جهان"},
                        {"Dhivehi", "ހެލޯ ވޯލްޑް"}, {"Dinka", "Muɔny Pinynhom"},
                        {"Dogri", "नमस्कार दुनिया"}, {"Dombe", "Wapona Nyika"},
                        {"Dutch", "Hallo wereld"}, {"Dyula", "Bonjour Duniɲa"},
                        {"Dzongkha", "ཧེ་ལོ་འཛམ་གླིང་།"}, {"Esperanto", "Saluton Mondo"}, //60
                        {"Estonian", "Tere maailm"}, {"Ewe", "Mido gbe na Xexeame"},
                        {"Faroese", "Hey heimur"}, {"Fijian", "Saluton Mondo"},
                        {"Filipino", "Kumusta Mundo"}, {"Finnish", "Hei maailma"},
                        {"Fon", "Kudo Gbɛ ɔ"}, {"French", "Bonjour le monde"},
                        {"French (Canada)", "Salut tout le monde"}, {"Frisian", "Hallo wrâld"}, //70
                        {"Friulian", "Ciao mont"}, {"Fulani", "On njaaraama Aduna"},
                        {"Ga", "Helo Jeŋ"}, {"Galician", "Ola Mundo"},
                        {"Georgian", "გამარჯობა მსოფლიო"}, {"German", "Hallo Welt"},
                        {"Greek", "Γεια σου κόσμε"}, {"Guarani", "Maitei Mundo"},
                        {"Gujarati", "હેલો વર્લ્ડ"}, {"Haitian Creole", "Bonjou Mond"}, //80
                        {"Hakha Chin", "Hello Vawlei"}, {"Hausa", "Sannu Duniya"},
                        {"Hawaiian", "Aloha Honua"}, {"Hebrew", "שלום עולם"},
                        {"Hiligaynon", "Hello World"}, {"Hindi", "हैलो वर्ल्ड"},
                        {"Hmong", "Nyob Zoo Lub Ntiaj Teb"}, {"Hungarian", "Helló Világ"},
                        {"Hunsrik", "Hallo Welt"}, {"Iban", "Halo Dunya"}, //90
                        {"Icelandic", "Halló heimur"}, {"Igbo", "Ndewo Ụwa"},
                        {"Ilocano", "Hello Lubong"}, {"Indonesian", "Halo Dunia"},
                        {"Inuktut (Latin)", "Haluu nunarjuaq"}, {"Inuktut (Syllabics)", "ᕼᐊᓘ ᓄᓇᕐᔪᐊᖅ"},
                        {"Irish", "Haigh a Dhomhanda"}, {"Italian", "Ciao mondo"},
                        {"Jamaican Patois", "Hello World"}, {"Japanese", "こんにちは世界"}, //100
                        {"Javanese", "Halo Donya"}, {"Jingpo", "Hello Mungkan"},
                        {"Kalaallisut", "Hallo Verden"}, {"Kannada", "ಹಲೋ ವರ್ಲ್ಡ್"},
                        {"Kanuri", "Salam Dunya"}, {"Kapampangan", "Kamusta yatu"},
                        {"Kazakh", "Сәлем әлем"}, {"Khasi", "Khublei Pyrthei"},
                        {"Khmer", "សួស្តីពិភពលោក"}, {"Kiga", "Haro Ensi yoona"}, //110
                        {"Kikongo", "Mbote Nsi-Ntoto"}, {"Kinyarwanda", "Muraho Isi"},
                        {"Kituba", "Mbote Inza"}, {"Kokborok", "Joto Swngchar"},
                        {"Komi", "Здравствуйте мир"}, {"Konkani", "हॅलो वर्ल्ड"},
                        {"Korean", "안녕하세요 세상아"}, {"Krio", "Halo Wɔl"},
                        {"Kurdish (Kurmanji)", "Silav Cîhan"}, {"Kurdish (Sorani)", "سڵاو جیهان"}, //120
                        {"Kyrgyz", "Салам дүйнө"}, {"Lao", "ສະບາຍດີຊາວໂລກ"},
                        {"Latgalian", "Sveicīņs Pasauļam ."}, {"Latin", "Salve Mundus"},
                        {"Latvian", "Sveika, pasaule!"}, {"Ligurian", "Ciao Mondo"},
                        {"Limburgish", "Hallo Wereld"}, {"Lingala", "Mbote Mokili"},
                        {"Lithuanian", "Sveikas, pasauli"}, {"Lombard", "Ciao Mondo"}, //130
                        {"Luganda", "Mwasuze mutya Ensi"}, {"Luo", "Mos Piny"},
                        {"Luxembourgish", "Moien Welt"}, {"Macedonian", "Здраво свете"},
                        {"Madurese", "Halo Dunnya"}, {"Maithili", "नमस्कार दुनिया"},
                        {"Makassar", "Hallo Dunia"}, {"Malagasy", "Hello World"},
                        {"Malay", "Halo Dunia"}, {"Malay (Jawi)", "سلام دنيا"}, //140
                        {"Malayalam", "ഹലോ വേൾഡ്"}, {"Maltese", "Bongu Dinja"},
                        {"Mam", "B´a´n q´ij twitz tx´otx´"}, {"Manx", "Halloo yn Dooinney"},
                        {"Maori", "Kia ora te ao"}, {"Marathi", "हॅलो वर्ल्ड"},
                        {"Marshallese", "Yokwe lal in"}, {"Marwadi", "नमस्कार दुनिया"},
                        {"Mauritian Creole", "Bonzour Lemond"}, {"Meadow Mari", "Салам лийже Тӱня"}, //150
                        {"Meiteilon (Manipuri)", "ꯍꯦꯂꯣ ꯋꯥꯔꯜꯗ꯫"}, {"Minang", "Halo Dunia"},
                        {"Mizo", "Hello Khawvel"}, {"Mongolian", "Сайн уу Дэлхий"},
                        {"Myanmar (Burmese)", "မင်္ဂလာပါကမ္ဘာလောက"}, {"Nahuatl (Eastern Huasteca)", "Kuali kajki Tlaltipaktli"},
                        {"Ndau", "Kwazuwai Nyika"}, {"Ndebele (South)", "Sawubona iphasi"},
                        {"Nepalbhasa (Newari)", "ज्वजलपा हलिं"}, {"Nepali", "नमस्ते संसार"}, //160
                        {"NKo", "ߊߟߎ߫ ߣߌ߫ ߖߐ߫ ߘߎߢߊ߫"}, {"Norwegian", "Hallo verden"},
                        {"Nuer", "Ɣëlö Wecmuɔ̱ɔ̱n"}, {"Occitan", "Adieu Mond"},
                        {"Odia (Oriya)", "ନମସ୍କାର ବିଶ୍ୱ"}, {"Oromo", "Akkam jirtu Addunyaa"},
                        {"Ossetian", "Салам Дуне"}, {"Pangasinan", "Hello World"},
                        {"Papiamento", "Hola Mundu"}, {"Pashto", "سلام نړی"}, //170
                        {"Persian", "سلام دنیا"}, {"Polish", "Witaj świecie"},
                        {"Portuguese (Brazil)", "Olá Mundo"}, {"Portuguese (Portugal)", "Olá, mundo!"},
                        {"Punjabi (Gurmukhi)", "ਸਤਿ ਸ੍ਰੀ ਅਕਾਲ ਦੁਨਿਆ"}, {"Punjabi (Shahmukhi)", "ہیلو ورلڈ"},
                        {"Quechua", "Allinllachu Mundo"}, {"Qʼeqchiʼ", "Chaab'il eere li Ruchich'och'"},
                        {"Romani", "Bachtalo Luma"}, {"Romanian", "Salut Lume"}, //180
                        {"Rundi", "Muraho Isi"}, {"Russian", "Привет, мир"},
                        {"Sami (North)", "Hei máilbmi"}, {"Samoan", "Talofa Lalolagi"},
                        {"Sango", "Bonjour Monde"}, {"Sanskrit", "नमस्कार विश्व"},
                        {"Santali (Latin)", "Johar Duniya"}, {"Santali (Ol Chiki)", "ᱡᱚᱦᱟᱨ ᱡᱮᱜᱮᱛ"},
                        {"Scots Gaelic", "Halò an t-Saoghail"}, {"Sepedi", "Thobela Lefase"}, //190
                        {"Serbian", "Здраво свете"}, {"Sesotho", "Lefatše Lumela"},
                        {"Seychellois Creole", "Bonzour Lemonn"}, {"Shan", "မႂ်ႇသုင်လုမ်ႈၾႃႉ"},
                        {"Shona", "Mhoro Nyika"}, {"Sicilian", "Ciao Munnu"},
                        {"Silesian", "Witaj Świat"}, {"Sindhi", "هيلو ورلڊ"},
                        {"Sinhala", "හෙලෝ වර්ල්ඩ්"}, {"Slovak", "Ahoj svet"}, //200
                        {"Slovenian", "Pozdravljen svet"}, {"Somali", "Salaan Adduun"},
                        {"Spanish", "Hola Mundo"}, {"Sundanese", "Halo Dunya"},
                        {"Susu", "DuniE wo xa sEwa"}, {"Swahili", "Habari Dunia"},
                        {"Swati", "Sawubona Umhlaba"}, {"Swedish", "Hej världen"},
                        {"Tahitian", "Aroha mai i te Ao nei"}, {"Tajik", "Салом Ҷаҳон"}, //210
                        {"Tamazight", "Azul Amaḍal"}, {"Tamazight (Tifinagh)", "ⴰⵣⵓⵍ ⴰⵎⴰⴹⴰⵍ"},
                        {"Tamil", "வணக்கம் உலகம்"}, {"Tatar", "Сәлам Дөнья"},
                        {"Telugu", "హలో వరల్డ్"}, {"Tetum", "Olá Mundu"},
                        {"Thai", "สวัสดีชาวโลก"}, {"Tibetan", "ཀྭ་ཡེ་འཛམ་གླིང་།"},
                        {"Tigrinya", "ሰላም ዓለም"}, {"Tiv", "Msugh ne cii"}, //220
                        {"Tok Pisin", "Hello Wol"}, {"Tongan", "Malo Mamani"},
                        {"Tshiluba", "Muoyo wenu buloba bujima"}, {"Tsonga", "Xewani Misava"},
                        {"Tswana", "Dumela Lefatshe"}, {"Tulu", "ನಮಸ್ಕಾರ ಜಗತ್ತ್"},
                        {"Tumbuka", "Monileni Charu"}, {"Turkish", "Selam Dünya"},
                        {"Turkmen", "Salam Dünýä"}, {"Tuvan", "Экии, делегей"}, //230
                        {"Twi", "Hello Wiase"}, {"Udmurt", "Ӟечбуресь, дунне"},
                        {"Ukrainian", "Привіт, світ"}, {"Urdu", "ہیلو ورلڈ"},
                        {"Uyghur", "سالام دۇنيا"}, {"Uzbek", "Salom Dunyo"},
                        {"Venda", "Lotsha Shango"}, {"Venetian", "Ciao mondo"},
                        {"Vietnamese", "Chào thế giới"}, {"Waray", "Kumusta Kalibutan"}, //240
                        {"Welsh", "Helo Byd"}, {"Wolof", "Nanga def"},
                        {"Xhosa", "Molo Lizwe"}, {"Yakut", "Дорооболорун Аан дойду"},
                        {"Yiddish", "העלא וועלט"}, {"Yoruba", "Mo ki O Ile Aiye"},
                        {"Yucatec Maya", "Hola yóok'ol kaab"}, {"Zapotec", "Hola Mundo"},
                        {"Zulu", "Sawubona Mhlaba"}, {"BLAH", "BLAH"}, //250
                        {"BLAH", "BLAH"}, {"Pig-Latin", "elloHay orldWay"}
                };
    }
}