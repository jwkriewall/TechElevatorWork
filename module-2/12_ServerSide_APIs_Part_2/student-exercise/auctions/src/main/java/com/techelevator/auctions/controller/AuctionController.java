package com.techelevator.auctions.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.exception.addNewAuction;
import com.techelevator.auctions.exception.noAuctionFound;
import com.techelevator.auctions.model.Auction;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	@Autowired
    private AuctionDAO dao;

    public AuctionController(AuctionDAO dao) {
        this.dao = dao;
    }

    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {

        if( !title_like.equals("") ) {
            return dao.searchByTitle(title_like);
        }
        if(currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        }

        return dao.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) throws AuctionNotFoundException {
        return dao.get(id);
    }

    @RequestMapping( path = "", method = RequestMethod.POST)
    public Auction create(@Valid @RequestBody Auction auction) throws addNewAuction {
    	dao.create(auction);
    	throw new addNewAuction();
    }
    
    @RequestMapping(path="/{id}", method = RequestMethod.PUT)
    public Auction update (@Valid @RequestBody Auction auction, @PathVariable int id) throws AuctionNotFoundException {
    return dao.update(auction, id);
    }
    
    @RequestMapping(path="/{id}", method = RequestMethod.DELETE)
    public void delete(@Valid @PathVariable int id) throws AuctionNotFoundException, noAuctionFound {
    	dao.delete(id);
    	throw new noAuctionFound();
    }
}
