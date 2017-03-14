package cn.zhisheng.controller;

import cn.zhisheng.model.AutoEntity;
import cn.zhisheng.model.CityEntity;
import cn.zhisheng.model.OrderEntity;
import cn.zhisheng.model.UserEntity;
import cn.zhisheng.repository.AutoRepository;
import cn.zhisheng.repository.CityRepository;
import cn.zhisheng.repository.OrderRepository;
import cn.zhisheng.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class IndexController
{

    @Autowired
    UserRepository userRepository;

    @Autowired
    AutoRepository autoRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    OrderRepository orderRepository;


    //User
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    public String getUser(ModelMap modelMap)
    {

        List<UserEntity> userList = userRepository.findAll();

        modelMap.addAttribute("userList", userList);

        return "admin/users";
    }

    @RequestMapping(value = "/admin/users/add", method = RequestMethod.GET)
    public String addUser()
    {
        return "admin/addUser";
    }


    @RequestMapping(value = "/admin/users/addP", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") UserEntity userEntity)
    {
        userRepository.saveAndFlush(userEntity);

        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/admin/users/show/{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable("id") Integer userId, ModelMap modelMap)
    {
        UserEntity userEntity = userRepository.findOne(userId);

        modelMap.addAttribute("user", userEntity);

        return "admin/userDetail";
    }

    @RequestMapping(value = "/admin/users/update/{id}", method = RequestMethod.GET)
    public String updateUser(@PathVariable("id") Integer userId, ModelMap modelMap)
    {
        UserEntity userEntity = userRepository.findOne(userId);

        modelMap.addAttribute("user", userEntity);

        return "admin/updateUser";
    }

    @RequestMapping(value = "/admin/users/updateP", method = RequestMethod.POST)
    public String updateUserPost(@ModelAttribute("userP") UserEntity user)
    {
        userRepository.updateUser(user.getUsername(), user.getMobile_number(), user.getId());

        userRepository.flush();
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/admin/users/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer userId)
    {
        userRepository.delete(userId);

        userRepository.flush();
        return "redirect:/admin/users";
    }



    //City
    @RequestMapping(value = "/admin/citys", method = RequestMethod.GET)
    public String getCity(ModelMap modelMap)
    {
        List<CityEntity> cityList = cityRepository.findAll();
        modelMap.addAttribute("cityList", cityList);

        return "admin/citys";
    }

    @RequestMapping(value = "/admin/citys/add", method = RequestMethod.GET)
    public String addCity()
    {
        return "admin/addCity";
    }

    @RequestMapping(value = "/admin/citys/addP", method = RequestMethod.POST)
    public String addCityPost(@ModelAttribute("city") CityEntity cityEntity)
    {
        cityRepository.saveAndFlush(cityEntity);
        return "redirect:/admin/citys";
    }

    @RequestMapping(value = "/admin/citys/show/{id}", method = RequestMethod.GET)
    public String showCity(@PathVariable("id") Integer cityId, ModelMap modelMap)
    {
        CityEntity cityEntity = cityRepository.findOne(cityId);
        modelMap.addAttribute("city", cityEntity);

        return "admin/cityDetail";
    }

    @RequestMapping(value = "/admin/citys/update/{id}", method = RequestMethod.GET)
    public String updateCity(@PathVariable("id") Integer cityId, ModelMap modelMap)
    {
        CityEntity cityEntity = cityRepository.findOne(cityId);
        modelMap.addAttribute("city", cityEntity);
        return "admin/updateCity";
    }

    @RequestMapping(value = "/admin/citys/updateP", method = RequestMethod.POST)
    public String updateCityPost(@ModelAttribute("cityP") CityEntity city)
    {
        cityRepository.updateCity(city.getCity(), city.getRegion(), city.getId());
        cityRepository.flush();
        return "redirect:/admin/citys";
    }

    @RequestMapping(value = "/admin/citys/delete/{id}", method = RequestMethod.GET)
    public String deleteCity(@PathVariable("id") Integer cityId)
    {
        cityRepository.delete(cityId);
        cityRepository.flush();
        return "redirect:/admin/citys";
    }


    //Auto
    @RequestMapping(value = "/admin/autos", method = RequestMethod.GET)
    public String getAuto(ModelMap modelMap)
    {

        List<AutoEntity> autoList = autoRepository.findAll();
        modelMap.addAttribute("autoList", autoList);
        return "admin/autos";
    }

    @RequestMapping(value = "/admin/autos/add", method = RequestMethod.GET)
    public String addAuto()
    {
        return "admin/addAuto";
    }

    @RequestMapping(value = "/admin/autos/addP", method = RequestMethod.POST)
    public String addAutoPost(@ModelAttribute("auto") AutoEntity autoEntity)
    {
        autoRepository.saveAndFlush(autoEntity);
        return "redirect:/admin/autos";
    }

    @RequestMapping(value = "/admin/autos/show/{id}", method = RequestMethod.GET)
    public String showAuto(@PathVariable("id") Integer autoId, ModelMap modelMap)
    {
        AutoEntity autoEntity = autoRepository.findOne(autoId);
        modelMap.addAttribute("auto", autoEntity);
        return "admin/autoDetail";
    }

    @RequestMapping(value = "/admin/autos/update/{id}", method = RequestMethod.GET)
    public String updateAuto(@PathVariable("id") Integer autoId, ModelMap modelMap)
    {
        AutoEntity autoEntity = autoRepository.findOne(autoId);
        modelMap.addAttribute("auto", autoEntity);
        return "admin/updateAuto";
    }

    @RequestMapping(value = "/admin/autos/updateP", method = RequestMethod.POST)
    public String updateAutoPost(@ModelAttribute("autoP") AutoEntity auto)
    {
        autoRepository.updateAuto(auto.getMarka(), auto.getModel(), auto.getColor(), auto.getYear(), auto.getPrice(), auto.getName_type(), auto.getCity(), auto.getUsername(), auto.getId());
        autoRepository.flush();
        return "redirect:/admin/autos";
    }

    @RequestMapping(value = "/admin/autos/delete/{id}", method = RequestMethod.GET)
    public String deleteAuto(@PathVariable("id") Integer autoId)
    {
        autoRepository.delete(autoId);
        autoRepository.flush();
        return "redirect:/admin/autos";
    }

    //Order
    @RequestMapping(value = "/admin/orders", method = RequestMethod.GET)
    public String getOrder(ModelMap modelMap)
    {

        List<OrderEntity> orderList = orderRepository.findAll();
        modelMap.addAttribute("orderList", orderList);
        return "admin/orders";
    }

    @RequestMapping(value = "/admin/orders/add", method = RequestMethod.GET)
    public String addOrder()
    {
        return "admin/addOrder";
    }


    @RequestMapping(value = "/admin/orders/addP", method = RequestMethod.POST)
    public String addOrderPost(@ModelAttribute("order") OrderEntity orderEntity)
    {
        orderRepository.saveAndFlush(orderEntity);
        return "redirect:/admin/orders";
    }

    @RequestMapping(value = "/admin/orders/show/{id}", method = RequestMethod.GET)
    public String showOrder(@PathVariable("id") Integer orderId, ModelMap modelMap)
    {
        OrderEntity orderEntity = orderRepository.findOne(orderId);
        modelMap.addAttribute("order", orderEntity);

        return "admin/orderDetail";
    }

    @RequestMapping(value = "/admin/orders/update/{id}", method = RequestMethod.GET)
    public String updateOrder(@PathVariable("id") Integer orderId, ModelMap modelMap)
    {
        OrderEntity orderEntity = orderRepository.findOne(orderId);
        modelMap.addAttribute("order", orderEntity);
        return "admin/updateOrder";
    }

    @RequestMapping(value = "/admin/orders/updateP", method = RequestMethod.POST)
    public String updateOrderPost(@ModelAttribute("orderP") OrderEntity order)
    {
        orderRepository.updateOrder(order.getName_order(), order.getCityByCityId(), order.getId());
        autoRepository.flush();
        return "redirect:/admin/orders";
    }

    @RequestMapping(value = "/admin/oreders/delete/{id}", method = RequestMethod.GET)
    public String deleteOrder(@PathVariable("id") Integer orderId)
    {
        orderRepository.delete(orderId);
        orderRepository.flush();
        return "redirect:/admin/orders";
    }

}
