package com.codeclan.project.CapstoneBackEnd.components;

import com.codeclan.project.CapstoneBackEnd.models.CuisineType;
import com.codeclan.project.CapstoneBackEnd.models.Reservation;
import com.codeclan.project.CapstoneBackEnd.models.Restaurant;
import com.codeclan.project.CapstoneBackEnd.models.User;
import com.codeclan.project.CapstoneBackEnd.repositories.ReservationRepository;
import com.codeclan.project.CapstoneBackEnd.repositories.RestaurantRepository;
import com.codeclan.project.CapstoneBackEnd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        User user1 = new User("Steve", "steve01", "steve@gmail.com");
        userRepository.save(user1);

        User user2 = new User("Not Steve", "NotStevie", "NotSteve@AOL.com");
        userRepository.save(user2);

        Restaurant cold_town_house = new Restaurant("Cold Town House", "4 Grassmarket, Edinburgh, EH1 2JU", "0131 357 2865", CuisineType.ITALIAN, "Casual stop with a rooftop terrace serving pizza with creative toppings, prosecco & craft beers.", 2, "https://coldtownhouse.co.uk/", "https://coldtownhouse.co.uk/wp-content/uploads/sites/10/dlm_uploads/2020/06/Cold-Town-House-Menu-16th-July.pdf", "https://www.useyourlocal.com/imgs/pubs/1200x630/061119-095137_coldtownhouse.jpeg", "55.947505341595736", "-3.1977799494746764");
        restaurantRepository.save(cold_town_house);


        Restaurant elCartel = new Restaurant("El Cartel", "15-16 Teviot Pl, Edinburgh, EH1 2QZ", "0131 370 8189", CuisineType.MEXICAN, "Our own take on authentic Mexican street food serving up the best vibes in town. ", 2, "http://www.elcartelmexicana.co.uk/", "https://elcartelmexicana.co.uk/wp-content/uploads/2021/08/EL_CARTEL_TEVIOT_FOOD.pdf", "http://spoonfulofscotland.com/wp-content/uploads/2017/03/elcartel_food4-temp-1.jpg", "55.94559657904356", "-3.1904039372895925");
        restaurantRepository.save(elCartel);

        Restaurant theOutsiderRestaurant = new Restaurant("The Outsider Restaurant", "15 George IV Bridge, Edinburgh, EH1 1EE", "0131 226 3131", CuisineType.BRITISH, "Laid-back eating using fresh, seasonal produce in split-level space with Castle views.", 3, "http://theoutsiderrestaurant.com/", "http://www.theoutsiderrestaurant.com/", "https://images.squaremeal.co.uk/cloud/restaurants/8644/26841299_1783722408358678_2496766542421467132_o.jpg?w=800", "55.947919682284315", "-3.1919006140448896");
        restaurantRepository.save(theOutsiderRestaurant);

        Restaurant ikagiRamen = new Restaurant("Ikigai Ramen", "13 W Crosscauseway, Newington, Edinburgh EH8 9JW", "07935 669042", CuisineType.JAPANESE, "Intimate traditional ramen bar, making homemade noodles and inhouse broths.", 2, "https://www.ikigairamen.co.uk/", "https://www.ikigairamen.co.uk/menu", "https://d1ralsognjng37.cloudfront.net/fb84a12a-3763-452c-bbb8-0708ac763627.jpeg", "55.943953345297416", "-3.1842469252990897");
        restaurantRepository.save(ikagiRamen);

        Restaurant cafeAndaluz = new Restaurant("Cafe Andaluz Old Town", "10-11 George IV Bridge, Edinburgh EH1 1EE", "0131 226 1002", CuisineType.SPANISH, "Caf?? Andaluz serves up sunshine on a plate in Glasgow, Edinburgh and Aberdeen. Take a small step from the grey to Ol??!", 3, "Homepage: https://www.cafeandaluz.com/edinburgh", "https://www.cafeandaluz.com/george-iv-menus", "https://images.squarespace-cdn.com/content/v1/5e7df00d6ab6a703523be98e/1586442397854-9PYNDWGBYUY89PDQ7PA7/CA+2018.11+8.jpg?format=1500w", "55.94814042971712", "-3.1921072315683405");
        restaurantRepository.save(cafeAndaluz);

        Restaurant topolobamba = new Restaurant("Topolobamba", "93 Lothian Rd, Edinburgh EH3 9AW", "0131 228 6863", CuisineType.MEXICAN, "Mexican street food restaurant serving big flavours, banging cocktails in a buzzing restaurant.", 2, "https://www.topolabamba.com/edinburgh", "https://static1.squarespace.com/static/603fa19a8fb2482000452b9f/t/60db1a3c10305444f6e66169/1624971843554/TopoA3tabelMenu2021c19_online.pdf", "https://images.squarespace-cdn.com/content/v1/603fa19a8fb2482000452b9f/1614933352025-BD7RB7FCYBAMRMRWL4F5/Topolabamba+Shot+10+514.jpg?format=1500w", "55.94657248323121", "-3.2054072059163534");
        restaurantRepository.save(topolobamba);

        Restaurant wagamama = new Restaurant("Wagamama", "1 Castle Terrace, Edinburgh EH1 2DP", "0131 229 5506", CuisineType.JAPANESE, "Asian-inspired & Japanese chain restaurant where dishes are whisked to long communal tables.", 3, "https://www.wagamama.com/restaurants/edinburgh/edinburgh-lothian-road", "http://www.wagamama.com/our-menu", "https://images.squaremeal.co.uk/cloud/restaurants/457/images/61998480-2555171764527956-6542452956770336768-o_11022021125550.jpg?w=928&h=522&fit=crop", "55.94873779237902", "-3.2061740153799247");
        restaurantRepository.save(wagamama);

        Restaurant gigi = new Restaurant("Gigi's", "74 Lothian St, and, Lasswade, Bonnyrigg, EH19 3AQ", "0131 660 6906", CuisineType.ITALIAN, "Bold, modern setting for classic regional Italian dishes including pizza, with a children's menu.", 2, "https://gigisrestaurant.co.uk/", "https://gigisrestaurant.co.uk/wp-content/uploads/2021/04/A-la-Carte.pdf", "https://gigisrestaurant.co.uk/wp-content/uploads/2021/04/placeholders_0000_Layer-12.jpg", "55.87689510561324", "-3.101518166702606");
        restaurantRepository.save(gigi);

        Restaurant sofiasLounge = new Restaurant("Sofia's Lounge", "The Salisbury Boutique Hotel, 43-45 Salisbury Rd, Edinburgh, EH16 5AA", "0131 285 1433", CuisineType.LEBANESE, "Experience exquisite fine dining at Sofias, Edinburgh???s freshest answer to Mediterranean and Middle Eastern Dining. Taking traditional Mediterranean cuisine and adding a contemporary twist.", 3, "http://www.sofiaslounge.co.uk/", "https://sofiaslounge.co.uk/menu.html", "https://just-eat-prod-eu-res.cloudinary.com/image/upload/c_fill,f_auto,q_auto,w_1200,h_630,d_uk:cuisines:burgers-6.jpg/v1/uk/restaurants/114466.jpg", "55.93770031806155", "-3.1771422865982553");
        restaurantRepository.save(sofiasLounge);

        Restaurant radiCibus = new Restaurant("radiCibus", "2 Deanhaugh St, Stockbridge, Edinburgh, EH4 1LY", "0131 285 8608", CuisineType.ITALIAN, "We are an independent italian eatery and offer traditional Italian food in a contemporary style, paying particular attention in choosing the best organic Scottish and Italian ingredients.", 4, "https://radicibus.co.uk/", "https://radicibus.co.uk/tasting-radicibus-menu/", "https://traveladestatic.imgix.net/media/image/radicibus-italian-restaurant.PNG", "55.958108358566804", "-3.2092784019389926");
        restaurantRepository.save(radiCibus);

        Reservation reservation1 = new Reservation("19/08/21", "19:10", 4, cold_town_house);
        reservationRepository.save(reservation1);

        Reservation reservation2 = new Reservation("19/08/21", "17:00", 2, ikagiRamen);
        reservationRepository.save(reservation2);

        Reservation reservation3 = new Reservation("19/08/21", "18:00", 3, theOutsiderRestaurant);
        reservationRepository.save(reservation3);
    }
}
