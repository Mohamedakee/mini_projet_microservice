package com.example.clientui.proxies;

import com.example.clientui.beans.PaiementBean;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-paiement")
@LoadBalancerClient(name = "microservice-paiement")
public interface MicroservicePaiementProxy {

    @PostMapping(value = "/MICROSERVICE-PAIEMENT\t/paiement")
    ResponseEntity<PaiementBean> payerUneCommande(@RequestBody PaiementBean paiement);

}