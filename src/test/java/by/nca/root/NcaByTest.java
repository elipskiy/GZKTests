package by.nca.root;

import by.nca.BaseTest;
import by.nca.root.about.*;
import by.nca.root.certificationSystem.CertificationSystemScreen;
import by.nca.root.databaseStatistics.DatabaseStatisticsScreen;
import by.nca.root.electronicalAppeal.SendElectronicalAppealScreen;
import by.nca.root.electronicalInteraction.ElectronicalInteractionScreen;
import by.nca.root.electronicalServices.ElectronicalServicesScreen;
import by.nca.root.forum.ForumScreen;
import by.nca.root.publicCadastralMap.PublicCadastralMapScreen;
import by.nca.root.registrationOrganizations.RegistrationOrganizationsScreen;
import by.nca.root.streetNames.StreetNamesScreen;
import by.nca.root.supportLine.SupportLineScreen;
import by.nca.root.taxesBase.LandTaxesBaseScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class NcaByTest extends BaseTest {

    @BeforeMethod()
    public void getNewDriver()	{
        getDriver();
        nullErrors();
    }

    @AfterMethod
    public void closeBrowser()	{
        driver.quit();
    }

    //------------Test case #1-----------------
    @DataProvider
    public Object[][] aboutCompanyData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - О предприятии",
                "Научно-производственное государственное республиканское унитарное предприятие \"Национальное кадастровое агентство\"\n" +
                        "(ГУП \"Национальное кадастровое агентство\")",
                Arrays.asList("Год образования:", "Функции:", "Информационные ресурсы:", "Основные проекты в области IT:", "Основные проекты в области оценки:", "Основные проекты в области права:", "Основные проекты в области формирования недвижимого имущества:", "Исполнитель государственных программ:")
                }
        };
    }

    @DataProvider
    public Object[][] directorshipData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - О предприятии - Руководство",
                        "Руководство",
                        Arrays.asList("Генеральный директор ФИЛИПЕНКО АНДРЕЙ АЛЕКСАНДРОВИЧ", "Заместитель генерального директора ЛЕВЧИК СЕРГЕЙ АНАТОЛЬЕВИЧ")
                }
        };
    }

    @DataProvider
    public Object[][] structureData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - О предприятии - Структура",
                        "Структура",
                        "Начальник отдела экономики, финансов и автоматизации учета – начальник отдела Машковская Инесса Николаевна\n" +
                                "\n" +
                                "Отдел документационного обеспечения, организационной и кадровой работы - начальник отдела Спиридонова Марина Ивановна\n" +
                                "\n" +
                                "Управление информационных технологий – начальник управления Кривенченко Елена Владимировна\n" +
                                "\n" +
                                "Управление формирования и государственной регистрации недвижимого имущества – начальник управления Жуков Денис Джонович\n" +
                                "\n" +
                                "Управление оценки –начальник управления Ритвинский Дмитрий Александрович\n" +
                                "\n" +
                                "Юридическое управление – начальник управления Гудкова Юлия Владимировна\n" +
                                "\n" +
                                "Управление договорно-правовой работы –начальник управления Дроздов Павел Владимирович\n" +
                                "\n" +
                                "Отдел материально-технического снабжения – начальник отдела Шебеко Валерий Александрович\n" +
                                "\n" +
                                "Отдел геоинформационных систем – начальник отдела Литреева Марина Александровна\n" +
                                "\n" +
                                "Отдел договорно-правовой работы – начальник отдела Лущик Татьяна Ивановна"
                }
        };
    }

    @DataProvider
    public Object[][] functionsData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - О предприятии - Задачи и функции предприятия",
                        "Задачи и функции предприятия",
                        Arrays.asList("1. Создание и ведение единого государственного регистра недвижимого имущества, прав на него и сделок с ним.", "2. Создание и ведение регистров (реестров) государственного земельного кадастра – единого реестра административно-территориальных и территориальных единиц Республики Беларусь, регистра земельных участков, регистра стоимости земельных участков, реестра цен на земельные участки, реестра земельных ресурсов Республики Беларусь.", "3. Кадастровая и экспертная оценка недвижимости, оценка иного имущества.", "4. Проведение экспертиз, связанных с формированием объектов недвижимости и оценкой недвижимости.", "5. Государственная регистрации и техническая инвентаризация недвижимого имущества. а также государственная регистрация прав, ограничений (обременений) прав на недвижимое имущество и сделок с ним относительно объектов недвижимого имущества, установленных законодательством.", "6. Разработка автоматизированных информационных систем, их технологий и программного обеспечения.", "7. Оказание правовых и технических услуг, связанных с государственной регистрацией недвижимого имущества, прав на него и сделок с ним.", "8. Издательская деятельность по вопросам государственного земельного кадастра, государственной регистрации недвижимого имущества, прав, ограничений (обременений)  прав на него и сделок с ним, оценка недвижимого имущества, рынка недвижимости.", "9. Обеспечение совершения регистрационных действий при ведении единого государственного регистра недвижимого имущества, прав на него и сделок с ним путем методологического руководства их совершения, аттестации и контроля деятельности регистраторов, проведения семинаров, координирования регистрационных действий регистраторов территориальных организаций по государственной регистрации недвижимого имущества, прав на него и сделок с ним в отношении недвижимого имущества, расположенного на территории более чем одного регистрационного округа.", "10. Предоставление в установленном порядке сведений и документов из единого государственного регистра недвижимого имущества, прав на него и сделок с ним, государственного земельного кадастра.", "11. Анализ, обобщение и ежегодное опубликование в средствах массовой информации сводных показателей государственной регистрации недвижимого имущества, прав, ограничений (обременений) прав на него и сделок с ним в Республике Беларусь по данным единого государственного регистра недвижимого имущества, прав на него и сделок с ним и государственного земельного кадастра.", "12. Осуществление научно-исследовательских и опытно-конструкторских работ в области систем, методов и средств учета, регистрации, оценки и управления недвижимым имуществом.", "13. Разработка нормативно-правовых основ адресной системы в Республике Беларусь, осуществление регистрации адресов и внесение их в кадастровые карты (планы).", "14. Международная деятельность в области ведения государственного земельного кадастра, государственной регистрации недвижимого имущества, прав, ограничений (обременений) на него и сделок с ним, оценки недвижимости и развития рынка недвижимости.", "15. Осуществление иных полномочий в области ведения государственного земельного кадастра, государственной регистрации недвижимого имущества, прав, ограничений (обременений) на него и сделок с ним в соответствии с законодательством Республики Беларусь.")
                        }
        };
    }

    @DataProvider
    public Object[][] legalData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - О предприятии - Нормативно-правовая база",
                        "Нормативно-правовая база",
                        Arrays.asList("1. Директива Президента Республики Беларусь от 31 декабря 2010 года № 4 «О развитии предпринимательской инициативы и стимулировании деловой активности в Республике Беларусь»;", "2. Директива Президента Республики Беларусь 14 июня 2007 года № 3 «Экономия и бережливость - главные факторы экономической безопасности государства»;", "3. Директива Президента Республики Беларусь 27 декабря 2006 года № 2 «О мерах по дальнейшей дебюрократизации государственного аппарата»;", "4. Директива Президента Республики Беларусь 11 марта 2004 года № 1 «О мерах по укреплению общественной безопасности и дисциплины»;", "5. Указ Президента Республики Беларусь 10 декабря 2002 года № 603 «О создании системы государственных организаций по государственной регистрации недвижимого имущества, прав на него и сделок с ним»;", "6. Указ Президента Республики Беларусь от 15 октября 2007 года № 498 «О дополнительных мерах по работе с обращениями граждан и юридических лиц»;", "7. Указ Президента Республики Беларусь от 26 апреля 2010 года № 200 «Об административных процедурах, осуществляемых государственными органами и иными организациями по заявлениям граждан»;", "8. Указ Президента Республики Беларусь от 28.03.2008 года № 187 «Об утверждении Положения о порядке оценки принадлежащих физическим лицам зданий и сооружений»;", "9. Закон Республики Беларусь 28 октября 2008 года «Об основах административных процедур»;", "10. Закон Республики Беларусь 22 июля 2002 года «О государственной регистрации недвижимого имущества, прав на него и сделок с ним»;", "11. Закон Республики Беларусь от 18 июля 2011 года «Об обращениях граждан и юридических лиц»;", "12. Особенная часть Налогового кодекса Республики Беларусь;", "13. Постановление Совета Министров Республики Беларусь от 17 февраля 2012 № 156 «Об утверждении единого перечня административных процедур, осуществляемых государственными органами и иными организациями в отношении юридических лиц и индивидуальных предпринимателей, внесении дополнения в постановление Совета Министров Республики Беларусь от 14 февраля 2009 г. № 193 и признании утратившими силу некоторых постановлений Совета Министров Республики Беларусь»;", "14. Постановление Совета Министров Республики Беларусь 1 июня    2004 года № 650 «Об утверждении положения о порядке совершения регистрационных действий в отношении предприятия как имущественного комплекса»;", "15. Постановление Совета Министров Республики Беларусь от 14 февраля 2009 года № 194 «О внедрении в постоянную эксплуатацию первой очереди программного комплекса «Одно окно» по обращениям граждан»;", "16. Постановление Государственного комитета по имуществу Республики Беларусь 21 марта 2007 года № 13 «О проведении отдельных (сложных и многоступенчатых) административных процедур и порядке взаимодействия подчиненных организаций при оформлении гражданами документов в отношении недвижимого имущества, предоставлении сведений и документов из единого государственного регистра недвижимого имущества, прав на него и сделок с ним»;", "17. Постановление Государственного комитета по имуществу Республики Беларусь 27 июля 2006 года № 13 «Об утверждении инструкции о порядке дистанционного доступа к единому государственному регистру недвижимого имущества, прав на него и сделок с ним»;", "18. Постановление Государственного комитета по имуществу Республики Беларусь от 29 января 2010 года № 10 «О некоторых вопросах ведения единого реестра административно-территориальных и территориальных единиц Республики Беларусь\" (вместе с \"Инструкцией о порядке ведения единого реестра административно-территориальных и территориальных единиц Республики Беларусь\", \"Инструкцией о порядке ведения цифровой карты административно-территориального деления Республики Беларусь единого реестра административно-территориальных и территориальных единиц Республики Беларусь»);", "19. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь 24 января 2005 года № 4 «Об утверждении инструкции о порядке предоставления сведений и документов в отношении недвижимого имущества, прав на него и сделок с ним организациями по государственной регистрации недвижимого имущества, прав на него и сделок с ним и внесении изменений в постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь от 4 июля 2003 г. № 6»;", "20. Постановление Государственного комитета по имуществу Республики Беларусь от 3 июня 2010 года № 37 «Об утверждении Инструкции о порядке ведения регистра стоимости земельных участков государственного земельного кадастра и выдачи информации из него»;", "21. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь 14 июня 2004 года № 28 «Об утверждении инструкции о порядке формирования и ведения регистрационной книги в отношении предприятия как имущественного комплекса»;", "22. Постановление Государственного комитета по имуществу Республики Беларусь от 19 июня 2012 года № 20 «Об установлении перечня документов и (или) сведений, запрашиваемых подчиненными Государственному комитету по имуществу Республики Беларусь государственными организациями при осуществлении административных процедур по заявлениям юридических лиц и индивидуальных предпринимателей, и признании утратившим силу постановления Государственного комитета по имуществу Республики Беларусь от 25 октября 2011 года № 59»;", "23. Постановление Государственного комитета по имуществу Республики Беларусь от 9 ноября 2010 года № 63 «Об определении перечня документов и (или) сведений, запрашиваемых подчиненными Государственному комитету по имуществу Республики Беларусь государственными организациями при осуществлении административных процедур по заявлениям граждан»;", "24. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь от 21 января 2003 года № 1 «Об утверждении Положения о порядке аттестации регистраторов и Положения о реестре регистраторов»;", "25. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь от 16 июня 2004 года № 29 «Об утверждении Инструкции о ведении реестра наименований улиц и дорог»;", "26. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь от 28 июля 2004 года № 39 «Об утверждении Инструкции о порядке проведения технической инвентаризации и проверки характеристик капитальных строений (зданий, сооружений), незавершенных законсервированных капитальных строений, изолированных помещений»;", "27. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь 4 июня     2004 года № 27 «Об утверждении инструкции о порядке формирования реестра цен на земельные участки государственного земельного кадастра и выдачи информации из него»;", "28. Постановление Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь 28 февраля 2003 года № 3 «Об утверждении положения о порядке прохождения стажировки в организациях по государственной регистрации недвижимого имущества, прав на него и сделок с ним»;", "29. Приказ Комитета по земельным ресурсам, геодезии и картографии при Совете Министров Республики Беларусь 8 апреля 2005 года № 60 «Об утверждении инструкции о корпоративной сети электронного обмена информацией между организациями по государственной регистрации недвижимого имущества, прав на него и сделок с ним с использованием электронной почты»;", "30. Приказ Государственного комитета по имуществу Республики Беларусь от 14 ноября 2011 года № 364 «Об утверждении Инструкции о порядке осуществления республиканской организацией по государственной регистрации недвижимого имущества, прав на него и сделок с ним мониторинга регистрационных действий».", "По состоянию на 05.02.2013")
                }
        };
    }

    @Test(priority = 1, dataProvider = "aboutCompanyData")
    public void goToAboutCompanyPage(String expectedTitle, String expectedHeader, List<String> expectedParagraphs) throws IOException {
        IndexScreen indexScreen = new IndexScreen(driver);
        AboutCompanyScreen aboutCompany = indexScreen.goToNcaBy_AboutCompany();

        String pageTitle = aboutCompany.getPageTitle();
        String pageHeader = aboutCompany.getTextHeader();
        List<String> pageParagraphs = aboutCompany.getTextParagraphs();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- О предприятии");
        assertEquals(pageTitle, expectedTitle, "Название страницы не совпадает с эталонным");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не совпадает с эталонным");
        assertEquals(pageParagraphs, expectedParagraphs, "Разделы текста не совпадают с эталонными");
    }

    @Test(priority = 2, dataProvider = "directorshipData")
    public void goToDirectorshipPage(String expectedTitle, String expectedHeader, List<String> expectedParagraphs) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        AboutCompanyScreen aboutCompany = indexScreen.goToNcaBy_AboutCompany();
        DirectorshipScreen directorshipScreen = aboutCompany.goToNcaBy_Directorship();

        String pageTitle = directorshipScreen.getPageTitle();
        String pageHeader = directorshipScreen.getTextHeader();
        List<String> pageParagraphs = directorshipScreen.getTextParagraphs();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- О предприятии");
        assertEquals(pageTitle, expectedTitle, "Название страницы не совпадает с эталонным");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не совпадает с эталонным");
        assertEquals(pageParagraphs, expectedParagraphs, "Разделы текста не совпадают с эталонными");
    }

    @Test(priority = 3, dataProvider = "structureData")
    public void goToStructurePage(String expectedTitle, String expectedHeader, String expectedParagraphs) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        AboutCompanyScreen aboutCompany = indexScreen.goToNcaBy_AboutCompany();
        StructureScreen structureScreen = aboutCompany.goToNcaBy_Structure();

        String pageTitle = structureScreen.getPageTitle();
        String pageHeader = structureScreen.getTextHeader();
        String pageParagraphs = structureScreen.getTextParagraph();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- О предприятии");
        assertEquals(pageTitle, expectedTitle, "Название страницы не совпадает с эталонным");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не совпадает с эталонным");
        assertEquals(pageParagraphs, expectedParagraphs, "Разделы текста не совпадают с эталонными");
    }

    @Test(priority = 4, dataProvider = "functionsData")
    public void goToObjectivesAndFunctionsPage(String expectedTitle, String expectedHeader, List<String> expectedParagraphs) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        AboutCompanyScreen aboutCompany = indexScreen.goToNcaBy_AboutCompany();
        ObjectivesAndFunctionsScreen functionsScreen = aboutCompany.goToNcaBy_ObjectivesAndFunctions();

        String pageTitle = functionsScreen.getPageTitle();
        String pageHeader = functionsScreen.getTextHeader();
        List<String> pageParagraphs = functionsScreen.getTextParagraphs();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- О предприятии");
        assertEquals(pageTitle, expectedTitle, "Название страницы не совпадает с эталонным");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не совпадает с эталонным");
        assertEquals(pageParagraphs, expectedParagraphs, "Разделы текста не совпадают с эталонными");
    }

    @Test(priority = 5, dataProvider = "legalData")
    public void goToLegalBasePage(String expectedTitle, String expectedHeader, List<String> expectedParagraphs) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        AboutCompanyScreen aboutCompany = indexScreen.goToNcaBy_AboutCompany();
        LegalBaseScreen legalBaseScreen = aboutCompany.goToNcaBy_LegalBase();

        String pageTitle = legalBaseScreen.getPageTitle();
        String pageHeader = legalBaseScreen.getTextHeader();
        List<String> pageParagraphs = legalBaseScreen.getTextParagraphs();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- О предприятии");
        assertEquals(pageTitle, expectedTitle, "Название страницы не совпадает с эталонным");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не совпадает с эталонным");
        assertEquals(pageParagraphs, expectedParagraphs, "Разделы текста не совпадают с эталонными");
    }


    //------------Test case #2-----------------

        @DataProvider
        public Object[][] registrationOrganizationsData() {
            return new Object[][]{
                    {"Национальное Кадастровое Агентство - Организации по регистрации",
                            Arrays.asList("Реквизиты РУП «Брестское агентство по государственной регистрации и земельному кадастру» и его структурных подразделений", "Реквизиты РУП «Витебское агентство по государственной регистрации и земельному кадастру» и его структурных подразделений", "Реквизиты РУП «Гомельское агентство по государственной регистрации и земельному кадастру» и его структурных подразделений", "Реквизиты РУП «Гродненское агентство по государственной регистрации и земельному кадастру» и его структурных подразделений", "Реквизиты РУП «Минское городское агентство по государственной регистрации и земельному кадастру»", "Реквизиты РУП «Минское областное агентство по государственной регистрации и земельному кадастру»", "Реквизиты структурных подразделений РУП «Минское областное агентство по государственной регистрации и земельному кадастру»", "Реквизиты РУП «Могилевское агентство по государственной регистрации и земельному кадастру» и его структурных подразделений"),
                            "http://agr.brest.by/rekvizits/", "Брестское агентство по государственной регистрации и земельному кадастру > Главная страница",
                            "http://vagr.vitebsk.by/?f=details", "Витебское агентство по государственной регистации и земельному кадастру",
                            "http://gagrzk.by/struct/", "РУП \"Гомельское агентство по государственной регистрации и земельному кадастру\" // Структура",
                            "http://kadastr.grodno.by/enterprise.html", "О предприятии",
                            "http://mga.by/about/rekvisiti/", "Реквизиты Агентства",
                        "http://www.moa.by/?page=1", "Минское областное агентство по государственной регистрации и земельному кадастру",
                        "http://www.moa.by/?page=4", "Минское областное агентство по государственной регистрации и земельному кадастру",
                        "http://mogilev.kadastr.by/index.php?option=com_content&view=article&id=136&Itemid=78", "Сведения об организации"
                }
                
        };
    }

    @Test(priority = 6, dataProvider = "registrationOrganizationsData")
    public void goToRegistrationOrganizationsAndCheckForLinksWorking (String expectedTitle, List<String> expectedLinks,
                                                                      String brestUrl, String brestTitle, String vitebskUrl,
                                                                      String vitebskTitle, String gomelUrl, String gomelTitle,
                                                                      String grodnoUrl, String grodnoTitle, String minskUrl,
                                                                      String minskTitle, String minskRegionMainUrl,
                                                                      String minskRegionMainTitle, String minskRegionUnitsUrl,
                                                                      String minskRegionUnitsTitle, String mogilevUrl,
                                                                      String mogilevTitle) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        RegistrationOrganizationsScreen registrationOrganizationsScreen = indexScreen.goToNcaBy_RegistrationOrganizations();

        String pageTitle = registrationOrganizationsScreen.getPageTitle();
        List<String> pageLinks = registrationOrganizationsScreen.getLinksList();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Организации по регистрации");
        assertEqualsContinue(pageTitle, expectedTitle, "Название страницы не совпадает с эталонным");
        assertEqualsContinue(pageLinks, expectedLinks, "Список ссылок не соответствует ожидаемому");

        Map<String,String> valuesMap;
        valuesMap = registrationOrganizationsScreen.goToBrestLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Брест");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), brestUrl, "Страница Брестского агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), brestTitle, "Страница Брестского агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToVitebskLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Витебск");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), vitebskUrl, "Страница Витебского агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), vitebskTitle, "Страница Витебского агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToGomelLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Гомель");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), gomelUrl, "Страница Гомельского агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), gomelTitle, "Страница Гомельского агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToGrodnoLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Гродно");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), grodnoUrl, "Страница Гродненского агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), grodnoTitle, "Страница Гродненского агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToMinskLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Минск");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), minskUrl, "Страница Минского агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), minskTitle, "Страница Минского агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToMinskRegionMainLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Минское областное");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), minskRegionMainUrl, "Страница Минского основного областного агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), minskRegionMainTitle, "Страница Минского основного областного агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToMinskRegionStructureUnitsLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Подразделения Минского областного");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), minskRegionUnitsUrl, "Страница струкутурных подразделений Минского областного агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), minskRegionUnitsTitle, "Страница струкутурных подразделений Минского областного агенства: неверный адрес");

        valuesMap = registrationOrganizationsScreen.goToMogilevLink();
        screenshot.takeScreenShot("ncaBy_Case_2_Могилев");
        registrationOrganizationsScreen.goBack();
        assertEqualsContinue(valuesMap.get("URL"), mogilevUrl, "Страница Могилёвского агентства: неверный адрес");
        assertEqualsContinue(valuesMap.get("Title"), mogilevTitle, "Страница Могилёвского агенства: неверный адрес");

        assertTrue(errors.isEmpty(), errors.toString());
    }

    //------------Test case #3-----------------

    @DataProvider
    public Object[][] certificationData() {
        return new Object[][]{
                {"Единая Система Аттестации",
                        Arrays.asList("\"Единая система аттестации\"", "В разделе «Учебное тестирование»", "«Система аттестации»")
                }
        };
    }

    @Test(priority = 7, dataProvider = "certificationData")
    public void goToCertificationSystem(String expectedTitle, List<String> expectedParagraphs) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        CertificationSystemScreen certificationSystemScreen = indexScreen.goToNcaBy_CertificationScreen();

        String pageTitle = certificationSystemScreen.getPageTitle();
        List<String> pageParagraphs = certificationSystemScreen.getTextParagraphs();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Система аттестации");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageParagraphs, expectedParagraphs, "Содержимое страницы не соотетствует ожидаемому");
    }

    //------------Test case #4-----------------

    @DataProvider
    public Object[][] forumData() {
        return new Object[][]{
                {"«Национальное кадастровое агентство» :: Главная",
                       "Национальное кадастровое агентство",
                        "Список форумов «Национальное кадастровое агентство»"
                }
        };
    }

    @Test(priority = 8, dataProvider = "forumData")
    public void goToForuссmSystem(String expectedTitle, String expectedHeader, String expectedForumText) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        ForumScreen forumScreen = indexScreen.goToNcaBy_ForumScreen();

        String pageTitle = forumScreen.getPageTitle();
        String pageHeader = forumScreen.getTextHeader();
        String pageForumText = forumScreen.getForumText();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Форум");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
        assertEquals(pageForumText, expectedForumText, "Текст не соответствует ожидаемому от форума");
    }

    //------------Test case #5-----------------

    @DataProvider
    public Object[][] electronicalAppealData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - Приемная - Электронные обращения",
                        "Электронные обращения",
                        "Отправить электронное обращение"
                }
        };
    }

    @Test(priority = 9, dataProvider = "electronicalAppealData")
    public void goToElectronicalAppeal(String expectedTitle, String expectedHeader, String expectedLinkText) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        SendElectronicalAppealScreen appealScreen = indexScreen.goToNcaBy_ElectronicalAppealScreen();

        String pageTitle = appealScreen.getPageTitle();
        String pageHeader = appealScreen.getTextHeader();
        String pageLinkText = appealScreen.getSendLinkText();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Отправить электронное обращение");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
        assertEquals(pageLinkText, expectedLinkText, "Текст не соответствует ожидаемому от страницы");
    }

    //------------Test case #6-----------------

    @DataProvider
    public Object[][] databaseStatisticsData() {
        return new Object[][]{
                {"Статистика обновления ЦБД",
                        "Статистика обновления ЦБД"
                }
        };
    }

    @Test(priority = 10, dataProvider = "databaseStatisticsData")
    public void goToDatabaseStatistics(String expectedTitle, String expectedHeader) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        DatabaseStatisticsScreen databaseStatisticsScreen = indexScreen.goToNcaBy_DatabaseStatisticsScreen();

        String pageTitle = databaseStatisticsScreen.getPageTitle();
        String pageHeader = databaseStatisticsScreen.getTextHeader();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Статистика обновления центральной базы данных ЕГРНИ");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

    //------------Test case #7-----------------

    @DataProvider
    public Object[][] electronicalServicesData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - Информационные ресурсы и E-услуги - Электронные услуги",
                    "Электронные услуги"
                }
        };
    }

    @Test(priority = 11, dataProvider = "electronicalServicesData")
    public void goToElectronicalServices(String expectedTitle, String expectedHeader) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        ElectronicalServicesScreen electronicalServicesScreen = indexScreen.goToNcaBy_ElectronicalServicesScreen();

        String pageTitle = electronicalServicesScreen.getPageTitle();
        String pageHeader = electronicalServicesScreen.getTextHeader();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Электронные услуги");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

    //------------Test case #8-----------------

    @DataProvider
    public Object[][] cadastralMapData() {
        return new Object[][]{
                {"http://map.nca.by/"}
        };
    }

    @Test(priority = 12, dataProvider = "cadastralMapData")
    public void goToPublicCadastralMap(String expectedUrl) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        PublicCadastralMapScreen cadastralMapScreen = indexScreen.goToNcaBy_PublicCadastralMapScreen();

        String pageUrl = cadastralMapScreen.getUrl();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Публичная кадастровая карта");

        assertEquals(pageUrl, expectedUrl, "Неверная URL страницы");
    }

    //------------Test case #9-----------------

    @DataProvider
    public Object[][] streetNamesData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - Информационные ресурсы и E-услуги - Присвоение наименований элементам улично-дорожной сети",
                "Присвоение наименований элементам улично-дорожной сети",
                "http://gzk.nca.by/streets.php",
                "Национальное Кадастровое Агентство - Информационные ресурсы и E-услуги - Присвоение наименований элементам улично-дорожной сети - Рекомендации по наименованиям элементов улично-дорожной сети",
                "Рекомендации по наименованиям элементов улично-дорожной сети"}
        };
    }

    @Test(priority = 13, dataProvider = "streetNamesData")
    public void goToStreetNames(String expectedTitleStreets, String expectedHeaderStreets, String expectedUrlElements,
                                String expectedTitleRecommendations, String expectedHeaderRecommendations) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        StreetNamesScreen streetNamesScreen = indexScreen.goToNcaBy_StreetNamesScreen();

        String pageTitle = streetNamesScreen.getPageTitle();
        String pageHeader = streetNamesScreen.getTextHeader();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Наименования улиц и элементов улично-дорожной сети");

        assertEqualsContinue(pageTitle, expectedTitleStreets, "Неверное название страницы");
        assertEqualsContinue(pageHeader, expectedHeaderStreets, "Заголовок страницы не соотетствует ожидаемому");

        Map<String, String> valueMap;

        valueMap = streetNamesScreen.goToElementsPage();
        screenshot.takeScreenShot("ncaBy_Наименования улиц и элементов улично-дорожной сети- Наименование элементов улично-дорожной сети");
        assertEqualsContinue(valueMap.get("URL"), expectedUrlElements, "Неверный URL");

        valueMap = streetNamesScreen.goToRecommendationsPage();
        screenshot.takeScreenShot("ncaBy_Наименования улиц и элементов улично-дорожной сети- Рекомендации по принятию решений");
        assertEqualsContinue(valueMap.get("Title"), expectedTitleRecommendations, "Неверное название страницы");
        assertEqualsContinue(valueMap.get("Header"), expectedHeaderRecommendations, "Заголовок страницы не соотетствует ожидаемому");

        assertTrue(errors.isEmpty(), errors.toString());
    }

    //------------Test case #10-----------------

    @DataProvider
    public Object[][] taxesBaseData() {
        return new Object[][]{
                {"http://vl.nca.by/"}
        };
    }

    @Test(priority = 14, dataProvider = "taxesBaseData")
    public void goToLandTaxesBase(String expectedUrl) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        LandTaxesBaseScreen taxesBaseScreen = indexScreen.goToNcaBy_LandTaxesBaseScreen();

        String pageUrl = taxesBaseScreen.getUrl();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Налоговая база земельного налога");

        assertEquals(pageUrl, expectedUrl, "Неверная URL страницы");
    }

    //------------Test case #11-----------------

    @DataProvider
    public Object[][] electronicalInteractionData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - Информационные ресурсы и E-услуги - Электронные услуги - Электронное взаимодействие по административным процедурам",
                        "Электронное взаимодействие по административным процедурам"
                }
        };
    }

    @Test(priority = 15, dataProvider = "electronicalInteractionData")
    public void goToElectronicalInteraction(String expectedTitle, String expectedHeader) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        ElectronicalInteractionScreen electronicalInteractionScreen = indexScreen.goToNcaBy_ElectronicalInteractionScreen();

        String pageTitle = electronicalInteractionScreen.getPageTitle();
        String pageHeader = electronicalInteractionScreen.getTextHeader();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Электронное взаимодействие по административным процедурам");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

    //------------Test case #12-----------------

    @DataProvider
    public Object[][] supportLineData() {
        return new Object[][]{
                {"Национальное Кадастровое Агентство - Информационные ресурсы и E-услуги - Правила пользования линией технической поддержки support@nca.by",
                        "Правила пользования линией технической поддержки support@nca.by"
                }
        };
    }

    @Test(priority = 16, dataProvider = "supportLineData")
    public void goToSupportLine(String expectedTitle, String expectedHeader) throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        SupportLineScreen supportLineScreen = indexScreen.goToNcaBy_SupportLineScreen();

        String pageTitle = supportLineScreen.getPageTitle();
        String pageHeader = supportLineScreen.getTextHeader();
        screenshot.takeScreenShot("ncaBy_Отображение страницы- Линия технической поддержки support@nca.by");

        assertEquals(pageTitle, expectedTitle, "Названия страниц не совпадают");
        assertEquals(pageHeader, expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

}



