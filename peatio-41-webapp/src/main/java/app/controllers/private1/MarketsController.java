package app.controllers.private1;

import app.models.Market;
import app.models.OrderAsk;
import app.models.OrderBid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//module Private
@Controller
public class MarketsController extends BaseController {
    private String bid;
    private String ask;

    private Market market;
    private String markets;
    private String market_groups;

    private String bids;
    private String asks;
    private String trades;

    private OrderBid order_bid;
    private OrderAsk order_ask;

/*
    skip_before_action :auth_member!, only: [:show]
    before_action :visible_market?
    after_action :set_default_market

    layout false
*/

    @RequestMapping(value = "/markets/{id}", method = RequestMethod.GET)
    public ModelAndView show(HttpServletRequest req, @PathVariable("id") String id) {
        this.bid = req.getParameter("bid");
        this.ask = req.getParameter("ask");

        this.market = current_market(req);
        this.markets = Market.all().sort();
        this.market_groups = null; // this.markets.map(&:quote_unit).uniq

        this.bids = null; // this.market.bids
        this.asks = null; // this.market.asks
        this.trades = null; // this.market.trades

        // default to limit order
        this.order_bid = new OrderBid(/*ord_type:'limit'*/);
        this.order_ask = new OrderAsk(/*ord_type:'limit'*/);

//        set_member_data if current_user
//        gon.jbuilder

        return null;
    }

/*
    private

    def visible_market?
      redirect_to market_path(Market.first) if not current_market.visible?
    end

    def set_default_market
      cookies[:market_id] = @market.id
    end

    def set_member_data
      @member = current_user
      @orders_wait = @member.orders.with_currency(@market).with_state(:wait)
      @trades_done = Trade.for_member(@market.id, current_user, limit: 100, order: 'id desc')
    end

*/
}
//end
