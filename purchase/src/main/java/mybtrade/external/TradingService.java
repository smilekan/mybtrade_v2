
package mybtrade.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@FeignClient(name="trading", url="http://trade:8080")
public interface TradingService {

    @RequestMapping(method= RequestMethod.POST, path="/tradings/purchaseCancel")
    @ResponseBody Trading purchasecancel(@RequestParam Long salesNum);

//    public void purchasecancel(@RequestBody Trading trading);

}