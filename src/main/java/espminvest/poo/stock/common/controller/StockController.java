package espminvest.poo.stock.common.controller;

import espminvest.poo.stock.common.datatype.EstimateBean;
import espminvest.poo.stock.common.datatype.StockBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static espminvest.poo.stock.common.constants.Constants.BASE_URL;

@FeignClient("service.stock")
public interface StockController {

    @GetMapping(BASE_URL + "/stocks")
    List<StockBean> listStocks();

    @GetMapping(BASE_URL + "/stocks/{stockId}")
    StockBean getStock(@PathVariable String stockId);

    @GetMapping(BASE_URL + "/{stockId}/{date}")
    EstimateBean getEstimate(@PathVariable String stockId, @PathVariable String date);

    @GetMapping(BASE_URL)
    List<EstimateBean> getEstimates(@RequestParam String stockId, @RequestParam String dateInit, @RequestParam String dateEnd);

}
