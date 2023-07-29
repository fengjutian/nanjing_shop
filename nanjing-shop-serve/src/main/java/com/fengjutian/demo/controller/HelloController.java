

@Controller
public clsdd HelloController(){
@GetMapping("demo")
    public String demo(Model model){
        model.addAttribute("title","SpringBoot中集成使用jsp");
        return "demo";
    }

}